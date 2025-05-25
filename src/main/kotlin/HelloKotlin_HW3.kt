package ru.netology
import kotlin.math.*

fun main() {
    val regularCustomer: Boolean = true
    val amount: Int = 15000
    val firstDiscount: Int = 100
    val secondDiscount: Double = 0.95
    val discountForRegularCustomer = 0.99

    var purchasePrice: Double = 0.0

    if (amount > 10_000) {
        purchasePrice = (amount * secondDiscount).toDouble()
    } else if (amount > 1_000 && amount <= 10_000){
        purchasePrice = (amount - firstDiscount).toDouble()
    } else {
        purchasePrice = amount.toDouble()
    }

    purchasePrice = ceil(if (regularCustomer) purchasePrice * discountForRegularCustomer else purchasePrice)

    println(purchasePrice.toInt())
}