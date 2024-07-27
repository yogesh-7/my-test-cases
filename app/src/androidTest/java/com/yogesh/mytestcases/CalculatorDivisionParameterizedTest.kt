package com.yogesh.mytestcases

import org.junit.runners.Parameterized
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(Parameterized::class)
class CalculatorDivisionParameterizedTest(private val input1: Int, private val input2: Int, private val expected: Int) {

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Int>> {
            return listOf(
                arrayOf(6, 3, 2),
                arrayOf(10, 2, 5),
                arrayOf(-6, 3, -2),
                arrayOf(0, 1, 0),
                arrayOf(-9, -3, 3)
            )
        }
    }

    @Test
    fun division_isCorrect() {
        val calculator = Calculator()
        assertEquals(expected, calculator.divide(input1, input2))
    }

    @Test(expected = IllegalArgumentException::class)
    fun division_byZero_throwsException() {
        val calculator = Calculator()
        calculator.divide(1, 0)
    }
}