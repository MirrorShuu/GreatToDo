package com.example.greattodo.models

import com.example.greattodo.R

enum class Color(val resId: Int) {
    RED(R.color.red,),
    YELLOW(R.color.yellow,),
    GREEN(R.color.green),
    BLUE(R.color.blue,),
    WHITE(R.color.grey,);



}

//enum class MyEnum {
//    FOO,
//    BAR
//}
//
//
//val bundle = Bundle()
//bundle.putAll(bundleOf("myKey", MyEnum.FOO))
//
//// to read
//val myEnum = bundle.get("myKey") as MyEnumClass




