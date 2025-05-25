package ru.netology

fun main() {
    val likes = 112
    val endOfAmount: String = if (likes % 10 == 1) "человеку" else "людям"

    println("Понравилось $likes $endOfAmount.")
}