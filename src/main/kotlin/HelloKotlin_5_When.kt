package ru.netology

fun main() {
    val userLevel = "Usual"
    var userDiscount = when (userLevel) {
        "Silver" -> 0.05
        "Gold" -> 0.1
        else -> 0.0
    }
    println(userDiscount)

    val day = "Sat"
    val isWeekEnd = when(day){
        "Mon", "Tue", "Wen", "Thu", "Fri" -> false
        else -> true
    }
    println(isWeekEnd)

    val a = 1
    val b = 0
    when {
        a == 1 -> println(true)
        b == 1 -> println(false)

    }
}