package ru.netology

import org.junit.Assert.*
import org.junit.Test

class HelloKotlin_7_DebuggingTestingTest {

    @Test
    fun calculatePrice() {
        val itemPrice: Int = 100
        val itemCount: Int = 1
        val discount: Int = 10
        val discountStart: Int = 1_000
        val level: String = "gold"

        val result = calculatePrice(itemCount, itemPrice, discount, discountStart, level)

        assertEquals(90, result)
    }

}