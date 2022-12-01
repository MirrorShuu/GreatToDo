package com.example.greattodo

import android.annotation.SuppressLint
import java.text.SimpleDateFormat
import java.util.*

@SuppressLint("SimpleDateFormat")
fun Long.formatDate(): String{
     val sdf = SimpleDateFormat("HH:mm:ss")
     val date = Date(this)
     return sdf.format(date)
 }