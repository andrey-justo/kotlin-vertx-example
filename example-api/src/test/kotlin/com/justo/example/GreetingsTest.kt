package com.justo.example

import com.justo.example.model.Greeting
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class GreetingsTest {

    @ParameterizedTest
    @CsvSource(
            "testing"
    )
    fun `test our greetings model`(msg: String) {
        val greeting = Greeting(msg)
        Assertions.assertNotNull(greeting)
        Assertions.assertNotNull(greeting.msg)
    }

}