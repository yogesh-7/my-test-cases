package com.yogesh.mytestcases

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class CalculatorMultiplicationParameterizedTest(private val input1: Int, private val input2: Int, private val expected: Int) {

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Int>> {
            return listOf(
                arrayOf(2, 3, 6),
                arrayOf(0, 5, 0),
                arrayOf(-2, 3, -6),
                arrayOf(-3, -3, 9),
                arrayOf(7, 1, 7)
            )
        }
    }

    @Test
    fun multiplication_isCorrect() {
        val calculator = Calculator()
        assertEquals(expected, calculator.multiply(input1, input2))
    }
}