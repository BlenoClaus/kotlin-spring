package com.bclaus.pontointeligente.service.impl

import com.bclaus.pontointeligente.documents.Empresa
import com.bclaus.pontointeligente.repository.EmpresaRepository
import com.bclaus.pontointeligente.service.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {

    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)

}