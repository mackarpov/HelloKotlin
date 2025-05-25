package ru.netology

fun main() {
    val minCommissionInPercents = 0.0075
    val minCommissionInRubles = 35
    val amount = 1001

    val commission = if (amount * minCommissionInPercents < minCommissionInRubles)
        minCommissionInRubles else amount * minCommissionInPercents

    println("Комиссия за перевод = ${commission.toInt()} рубля(рублей).")
}