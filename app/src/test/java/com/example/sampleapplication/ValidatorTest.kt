package com.example.sampleapplication

import com.example.sampleapplication.util.Validator
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class ValidatorTest{

    @Test
    fun validatePassword_input_valid_password_result_true() {
        val result = Validator.validatePassword("Hello123")
        assertEquals(true, result)
    }

    @Test
    fun validatePassword_input_empty_password_result_false() {
        val result = Validator.validatePassword("")
        assertEquals(false, result)
    }

    @Test
    fun validatePassword_input_long_password_result_false() {
        val result = Validator.validatePassword("HelloHello123456789")
        assertEquals(false, result)
    }

    @Test
    fun validatePassword_input_short_password_result_false() {
        val result = Validator.validatePassword("hello")
        assertEquals(false, result)
    }

    @Test
    fun reverseString(){
        val result = Validator.revereString("hello")
        assertEquals("olleh", result)
    }
}