package com.example.greattodo

import  android.annotation.SuppressLint
import android.media.Image
import android.widget.ImageView
import com.example.greattodo.models.Color
import java.lang.reflect.Array.get
import java.text.SimpleDateFormat
import java.util.*

@SuppressLint("SimpleDateFormat")
fun Long.formatDate(): String{
     val sdf = SimpleDateFormat("HH:mm:ss")
     val date = Date(this)
     return sdf.format(date)
 }

fun ImageView.load(id: Int){

}