package com.example.androidfirst

fun main() {
    var user:User1 = User1(10,10 ,10)
    println(user.toString())
    user.someFun()
}

open class User1(var a: Int,var b: Int,var c:Int){
    init {
        println("i am main constructor")
    }
    constructor():this(0){
        println("i am sub constructor 1")
    }
    constructor(a:Int):this(a, 0){
        println("i am sub constructor 2")
    }
    constructor(a:Int, b:Int):this(a, b, 0){
        println("i am sub constructor 3")
    }

    override fun toString(): String {
        return "a = ${this.a} b = ${this.b} c = ${this.c}"
    }

    fun someFun(){
        println("member variable a = ${a}")
    }
}

class User3(var a1: Int,var b1: Int,var c1:Int, var d:Int) : User1(a1, b1, c1){

}