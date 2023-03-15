package com.example.androidfirst

fun main() {
    class NonDataClass(val name: String, val email: String, val age: Int)
    data class DataClass(val name: String, val email: String, val age: Int)

    val nonObj1 = NonDataClass("cho","cho@gmail",20)
    val nonObj2 = NonDataClass("cho","cho@gmail",20)
    val dataObj1 = DataClass("cho","cho@gmail",20)
    val dataObj2 = DataClass("cho","cho@gmail",20)

    println("nonobj1 == nonobj2 : ${nonObj1 == nonObj2}")
    println("nonobj1.equals(nonobj2) : ${nonObj1.equals(nonObj2)}")
    println("dataobj1 == dataobj2 : ${dataObj1 == dataObj2}")
    println("dataobj1.equals(dataobj2) : ${dataObj1.equals(dataObj2)}")

    println(nonObj1.toString())
    println(dataObj1.toString())
}
