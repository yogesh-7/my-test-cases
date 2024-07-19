package com.yogesh.mytestcases

// CalculatorTest.kt
import org.junit.Assert.assertEquals
import org.junit.Test

// Unit tests for the Calculator class
class CalculatorTest {

    // Instance of Calculator to be used in the tests
    private val calculator = Calculator()

    // Test to verify the addition of two positive numbers
    @Test
    fun addition_isCorrect() {
        val result = calculator.add(2, 3)
        assertEquals(5, result)
    }

    // Test to verify the addition of a positive and a negative number
    @Test
    fun addition_withNegativeNumbers() {
        val result = calculator.add(3, -2)
        assertEquals(1, result)
    }

    // Test to verify the addition of a number and zero
    @Test
    fun addition_withZero() {
        val result = calculator.add(3, 0)
        assertEquals(3, result)
    }

    // Test to verify the subtraction of two positive numbers
    @Test
    fun subtraction_isCorrect() {
        val result = calculator.subtract(5, 3)
        assertEquals(2, result)
    }

    // Test to verify the multiplication of two positive numbers
    @Test
    fun multiplication_isCorrect() {
        val result = calculator.multiply(2, 3)
        assertEquals(6, result)
    }

    // Test to verify the division of two positive numbers
    @Test
    fun division_isCorrect() {
        val result = calculator.divide(6, 3)
        assertEquals(2, result)
    }

    // Test to verify that division by zero throws an IllegalArgumentException
    @Test(expected = IllegalArgumentException::class)
    fun division_byZero_throwsException() {
        calculator.divide(6, 0)
    }
}