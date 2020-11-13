package com.smilem.firstapp

/**
 * 시작함수
 */
fun main(){
    helloWorld()
}

/*
 return형 Unit = void
 Redundant : 불필요한
 Unit 안써도 되는데 굳이 쓰냐?
 */
// fun helloWorld() : Unit {
fun helloWorld() {
    println("Hello World!")
}

/**
 * 파라미터 작성
 * 변수: 타입
 * 리턴은 함수 뒤에 : 리턴타입
 */
fun add(a:Int, b:Int) : Int {
    return a+b
}