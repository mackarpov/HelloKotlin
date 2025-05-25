package ru.netology

fun main() {
    val itemPrice = 100
    val itemCount = 11
    val discount = 100
    val discountStart = 1000

    val totalPrice: Int = itemPrice * itemCount
    val result = if (totalPrice > discountStart) totalPrice - discount else totalPrice

    println(result)
}