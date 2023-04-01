package com.example.sampleapplication

import com.example.sampleapplication.util.Helper
import org.junit.Assert
import org.junit.Assert.*

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class HelperTest {

    @Test
    fun isPalindrome_input_hello_result_false() {
        val helper = Helper()
        var result= helper.isPalindrome("hello")
        Assert.assertEquals(false, result)
    }

    @Test
    fun isPalindrome_input_level_result_true() {
        val helper = Helper()
        var result= helper.isPalindrome("level")
        Assert.assertEquals(true, result)
    }
}