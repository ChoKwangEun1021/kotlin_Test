package com.example.androidfirst

fun main() {
    var data: Any = 10

    when(data){
        is String -> println("data type is string")
        10,20,30,40 -> println("data type is 10,20,30,40 value = ${data}")
        in 50..100 -> println("data is in 50 .. 100")
        else -> println("data is not valid")
    }
}