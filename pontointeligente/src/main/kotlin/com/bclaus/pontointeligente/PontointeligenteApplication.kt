package com.bclaus.pontointeligente

import com.bclaus.pontointeligente.documents.Empresa
import com.bclaus.pontointeligente.documents.Funcionario
import com.bclaus.pontointeligente.enums.PerfilEnum
import com.bclaus.pontointeligente.repository.EmpresaRepository
import com.bclaus.pontointeligente.repository.FuncionarioRepository
import com.bclaus.pontointeligente.repository.LancamentoRepository
import com.bclaus.pontointeligente.utils.SenhaUtils
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@SpringBootApplication
@EnableMongoRepositories("com.bclaus.pontointeligente.repository")
class PontointeligenteApplication(val empresaRepository: EmpresaRepository,
								  val funcionarioRepository: FuncionarioRepository,
								  val lancamentoRepository: LancamentoRepository) : CommandLineRunner {

	override fun run(vararg args: String?) {
		empresaRepository.deleteAll()
		funcionarioRepository.deleteAll()
		lancamentoRepository.deleteAll()

		val empresa: Empresa = empresaRepository.save(Empresa("Empresa", "10443887000146"))
		val admin: Funcionario = funcionarioRepository.save(Funcionario("Admin", "admin@empresa.com",
				SenhaUtils().gerarBcrypt("123456"), "25708317000",
				PerfilEnum.ROLE_ADMIN, empresa.id!!))

		val funcionario: Funcionario = funcionarioRepository.save(Funcionario("Funcionario",
				"funcionario@empresa.com", SenhaUtils().gerarBcrypt("123456"),
				"44325441557", PerfilEnum.ROLE_USUARIO, empresa.id!!))

		println("Empresa ID: " + empresa.id)
		println("Admin ID: " + admin.id)
		println("Funcionario ID: " + funcionario.id)
	}

}

fun main(args: Array<String>) {
	runApplication<PontointeligenteApplication>(*args)
}
