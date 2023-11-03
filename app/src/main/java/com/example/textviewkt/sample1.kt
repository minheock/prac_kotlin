package com.example.textviewkt

fun main(){
    helloWorld()
    println(add(4, 5))
}
// 1. 함수

fun helloWorld() : Unit{//아무것도 리턴하지않으면 유닛을 써줘야함
    println("hello world")
}
fun add(a: Int, b: Int): Int {
    return a + b
}