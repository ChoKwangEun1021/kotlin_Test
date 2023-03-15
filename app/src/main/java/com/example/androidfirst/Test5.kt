package com.example.androidfirst

val a51: Byte = 0b00001011
val a52: Int = 123
val a53: Short = 123
val a54: Long = 20
val a55: Float = 10.0f
val a56: Boolean = true
var a57: Char = 'A'

fun main() {
    if (a57 == 'A'){
        println("true")
    }else{
        println("false")
    }

    val str2 = """
        Hello
        World
    """.trimIndent()
    println(str2)



}