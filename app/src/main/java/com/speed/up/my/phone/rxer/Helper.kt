package com.speed.up.my.phone.rxer

import java.util.*
import kotlin.time.Duration.Companion.milliseconds

class Helper {
    fun daysDiff(c1: Calendar, c2: Calendar): Long {
        val diffInMillis = c1.timeInMillis - c2.timeInMillis
        return diffInMillis.milliseconds.inWholeDays
    }
}