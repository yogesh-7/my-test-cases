package com.yogesh.mytestcases

// CalculatorTest.kt
import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {

    private val calculator = Calculator()
    @Test
    fun addition_isCorrect() {
        val result = calculator.add(2, 3)
        assertEquals(5, result)
    }

    @Test
    fun subtraction_isCorrect() {
        val result = calculator.subtract(5, 3)
        assertEquals(2, result)
    }

    @Test
    fun multiplication_isCorrect() {
        val result = calculator.multiply(2, 3)
        assertEquals(6, result)
    }

    @Test
    fun division_isCorrect() {
        val result = calculator.divide(6, 3)
        assertEquals(2, result)
    }

    @Test(expected = IllegalArgumentException::class)
    fun division_byZero_throwsException() {
        calculator.divide(6, 0)
    }
}