package com.hirani.ali.doyouevenlift.models

data class Exercise(var name: String = "", var weight: Int = 0, var reps: MutableList<Int> = arrayListOf(0)) {
}