package ru.netology.kotlinAppDev

const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_DAY = 86400

fun main() {

    val seconds: Int = 5000

    agoToText(seconds)
}

fun agoToText(seconds: Int) {

    var timeInMinutes: Int = 0
    var timeInHours: Int = 0

    when {
        seconds in 0..SECONDS_IN_MINUTE -> println("был(а) только что")
        seconds > SECONDS_IN_MINUTE && seconds <= SECONDS_IN_HOUR -> {
            timeInMinutes = seconds / SECONDS_IN_MINUTE
            println("был(а) $timeInMinutes ${correctMinutesEnding(timeInMinutes)} назад")
        }
        seconds > SECONDS_IN_HOUR && seconds <= SECONDS_IN_DAY -> {
            timeInHours = seconds / SECONDS_IN_HOUR
            println("был(а) $timeInHours ${correctHoursEnding(timeInHours)} назад")
        }
        seconds > SECONDS_IN_DAY && seconds <= SECONDS_IN_DAY * 2 -> println("был(а) вчера")
        seconds > SECONDS_IN_DAY * 2 && seconds <= SECONDS_IN_DAY * 3 -> println("был(а) позавчера")
        seconds > SECONDS_IN_DAY * 3 -> println("был(а) давно")
    }
}

fun correctMinutesEnding(timeInMinutes: Int): String {
    var word: String = ""
    when {
        timeInMinutes % 10 == 1 && timeInMinutes != 11 -> word = "минуту"
        timeInMinutes % 10 == 2 && timeInMinutes != 12 -> word = "минуты"
        timeInMinutes % 10 == 3 && timeInMinutes != 13 -> word = "минуты"
        timeInMinutes % 10 == 4 && timeInMinutes != 14 -> word = "минуты"
        timeInMinutes % 10 == 5 -> word = "минут"
        timeInMinutes % 10 == 6 -> word = "минут"
        timeInMinutes % 10 == 7 -> word = "минут"
        timeInMinutes % 10 == 8 -> word = "минут"
        timeInMinutes % 10 == 9 -> word = "минут"
        timeInMinutes % 10 == 0 -> word = "минут"
        timeInMinutes >= 10 && timeInMinutes <= 14 -> word = "минут"
    }
    return word
}

fun correctHoursEnding(timeInHours: Int): String {
    var word: String = ""
    when (timeInHours) {
        1, 21 -> word = "час"
        2, 3, 4, 22, 23, 24 -> word = "часа"
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 -> word = "часов"
    }
    return word
}