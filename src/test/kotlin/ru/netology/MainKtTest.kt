package ru.netology

import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun calculatePriceShouldNotAdd() {
        val itemPrice = 100
        val itemCount = 1
        val discount = 10
        val discountStart = 1000
        val level = "gold"

        val result = calculatePrice(itemCount, itemPrice, discount, discountStart, level)

        assertEquals(90, result)
    }

    @Test
    fun calculatePriceShouldAddDiscount() {
        val itemPrice = 1000
        val itemCount = 1
        val discount = 10
        val discountStart = 100
        val level = "gold"

        val result = calculatePrice(itemCount, itemPrice, discount, discountStart, level)

        assertEquals(891, result)
    }
}