package com.bclaus.pontointeligente.response

class Response<T> (
        val erros: ArrayList<String> = arrayListOf(),
        var data: T? = null
)