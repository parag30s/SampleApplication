package com.example.sampleapplication.util

object Validator {

    fun validatePassword(password: String): Boolean {
        return (password.isNotEmpty() && password.length > 6 && password.length < 15)
    }

    fun revereString(input: String): String{
        var str: String = ""
        var ch: Char

        for (i in input.length-1 downTo 0){
            str += input[i]
        }
        return str
    }
}