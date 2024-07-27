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

    // Test to verify the addition of two negative numbers
    @Test
    fun addition_withTwoNegativeNumbers() {
        val result = calculator.add(-2, -3)
        assertEquals(-5, result)
    }

    // Test to verify the subtraction of a larger number from a smaller number
    @Test
    fun subtraction_largerFromSmaller() {
        val result = calculator.subtract(3, 5)
        assertEquals(-2, result)
    }

    // Test to verify the multiplication of a positive number and a negative number
    @Test
    fun multiplication_withPositiveAndNegative() {
        val result = calculator.multiply(3, -2)
        assertEquals(-6, result)
    }

    // Test to verify the multiplication of two negative numbers
    @Test
    fun multiplication_withTwoNegativeNumbers() {
        val result = calculator.multiply(-3, -2)
        assertEquals(6, result)
    }

    // Test to verify the division of a number by one
    @Test
    fun division_byOne() {
        val result = calculator.divide(6, 1)
        assertEquals(6, result)
    }

    // Test to verify the division of zero by a number
    @Test
    fun division_zeroByNumber() {
        val result = calculator.divide(0, 3)
        assertEquals(0, result)
    }

    // Test to verify division by a negative number
    @Test
    fun division_byNegativeNumber() {
        val result = calculator.divide(6, -3)
        assertEquals(-2, result)
    }

    // Test to verify division of a negative number by a positive number
    @Test
    fun division_negativeByPositive() {
        val result = calculator.divide(-6, 3)
        assertEquals(-2, result)
    }

}