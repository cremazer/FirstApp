package com.smilem.firstapp

class Book private constructor (val id : Int, val name : String) {
    // 이름을 사용할 수 있음.
    // static 개념?
    companion object BookFactory {
        fun create() = Book (0, "Do It Android")
    }
}