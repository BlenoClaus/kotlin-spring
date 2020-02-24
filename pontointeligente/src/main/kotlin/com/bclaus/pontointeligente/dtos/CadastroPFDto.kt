package com.bclaus.pontointeligente.dtos

import org.hibernate.validator.constraints.Length
import org.hibernate.validator.constraints.br.CNPJ
import org.hibernate.validator.constraints.br.CPF
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class CadastroPFDto (

        @get:NotEmpty(message = "Nome não pode ser vario")
        @get:Length(min = 3, max = 200, message = "Nome deve ter entre 3 e 200 caracteres")
        val nome: String = "",

        @get:NotEmpty(message = "Email não pode ser vario")
        @get:Length(min = 5, max = 200, message = "Email deve ter entre 5 e 200 caracteres")
        @get:Email(message = "Email inválido")
        val email: String = "",

        @get:NotEmpty(message = "Senha não pode ser vazia")
        val senha: String = "",

        @get:NotEmpty(message = "Cpf não pode ser vazio")
        @get:CPF(message = "Cpf inválido")
        val cpf: String = "",

        @get:NotEmpty(message = "Cnpj não pode ser vazio")
        @get:CNPJ(message = "Cnpj inválido")
        val cnpj: String = "",

        val empresaId: String = "",
        val valorHora: String? = null,
        val qtdeHorasTrabalhoDia: String? = null,
        val qtdeHorasAlmoco: String? = null,
        var id: String? = null

)