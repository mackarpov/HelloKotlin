package ru.netology.kotlinAppDev

import kotlin.math.*

const val ERROR_CARD = -1
const val ERROR_LIMIT = -2

fun main() {
    val cardType: String = "Visa"
    val amountOfTransfer: Int = 10000
    val sumOfPreviousTransfers = 10000

    println(commission(cardType, sumOfPreviousTransfers, amountOfTransfer))
}

fun commission(cardType: String = "Мир", sumOfPreviousTransfers: Int = 0, amountOfTransfer: Int): Int {
    if (amountOfTransfer > 150_000 || amountOfTransfer + sumOfPreviousTransfers > 600_000) return ERROR_LIMIT

    return when (cardType) {
        "Мир" -> 0
        "Mastercard" -> if (sumOfPreviousTransfers + amountOfTransfer <= 75000){
            0
        } else if (sumOfPreviousTransfers >= 75000) {
            (amountOfTransfer * 0.006).toInt() + 20
        } else {
            ((sumOfPreviousTransfers + amountOfTransfer - 75000) * 0.006).toInt() + 20
        }
        "Visa" -> max((amountOfTransfer * 0.0075).toInt(), 35)
        else -> ERROR_CARD
    }
}