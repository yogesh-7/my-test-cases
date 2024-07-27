package com.yogesh.mytestcases

// CalculatorParameterizedTest.kt
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class CalculatorParameterizedTest(private val input1: Int, private val input2: Int, private val expected: Int) {

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): Collection<Array<Int>> {
            return listOf(
                arrayOf(1, 1, 2),
                arrayOf(2, 2, 4),
                arrayOf(3, 3, 6),
                arrayOf(4, -1, 3),
                arrayOf(0, 0, 0)
            )
        }
    }

    @Test
    fun addition_isCorrect() {
        val calculator = Calculator()
        assertEquals(expected, calculator.add(input1, input2))
    }
}

