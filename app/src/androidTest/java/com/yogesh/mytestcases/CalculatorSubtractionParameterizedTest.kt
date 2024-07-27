package com.yogesh.mytestcases

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class CalculatorSubtractionParameterizedTest(private val input1: Int, private val input2: Int, private val expected: Int) {

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Int>> {
            return listOf(
                arrayOf(5, 3, 2),
                arrayOf(2, 2, 0),
                arrayOf(3, 3, 0),
                arrayOf(4, -1, 5),
                arrayOf(0, 0, 0)
            )
        }
    }

    @Test
    fun subtraction_isCorrect() {
        val calculator = Calculator()
        Assert.assertEquals(expected, calculator.subtract(input1, input2))
    }
}