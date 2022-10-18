package com.speed.up.my.phone.rxer

import java.util.*
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.DurationUnit

class Helper {
    fun daysDiff(c1: Calendar, c2: Calendar): Long {
        val diffInMillis = c1.timeInMillis - c2.timeInMillis
        return diffInMillis.milliseconds.inWholeDays
    }

    operator fun Calendar.minus(c: Calendar): Double {
        val diffInMillis = timeInMillis - c.timeInMillis
        return diffInMillis.milliseconds.toDouble(DurationUnit.DAYS)
    }
}