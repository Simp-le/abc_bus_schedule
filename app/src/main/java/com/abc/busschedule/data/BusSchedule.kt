package com.abc.busschedule.data

data class BusSchedule(
    val id: Int,
    val stopName: String,
    val arrivalTimeInMillis: Int
)