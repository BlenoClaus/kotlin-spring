package com.bclaus.pontointeligente.response

class Response<T> (
        val erros: List<String> = arrayListOf(),
        var data: T? = null
)