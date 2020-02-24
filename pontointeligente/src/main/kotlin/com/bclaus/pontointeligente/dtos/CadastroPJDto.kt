package com.bclaus.pontointeligente.dtos

import org.hibernate.validator.constraints.Length
import org.hibernate.validator.constraints.br.CNPJ
import org.hibernate.validator.constraints.br.CPF
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class CadastroPJDto (

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

        @get:NotEmpty(message = "Razão Social não pode ser vazia")
        @get:Length(min = 5, max = 200, message = "Razão Social deve ter entre 5 e 200 caracteres")
        val razaoSocial: String = "",

        var id: String? = null

)