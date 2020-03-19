package com.example.drivertracker.interfaces

@FunctionalInterface
interface IPositiveNegativeListener {
    fun onPositive()
    fun onNegative()
}