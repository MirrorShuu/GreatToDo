package com.example.greattodo.models

import com.example.greattodo.R

enum class Priority(val resId: Int) {
    LOW(R.string.priority_low),
    MIDDLE(R.string.priority_middle),
    HIGH(R.string.priority_high)
}