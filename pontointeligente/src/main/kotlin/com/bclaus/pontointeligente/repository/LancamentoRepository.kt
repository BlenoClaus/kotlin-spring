package com.bclaus.pontointeligente.repository

import com.bclaus.pontointeligente.documents.Lancamento
import org.springframework.data.mongodb.repository.MongoRepository
import java.awt.print.Pageable

interface LancamentoRepository : MongoRepository<Lancamento, String> {

    fun findByFuncionarioId(funcionarioId: String, pageable: Pageable): Lancamento

}