package com.smilem.firstapp

// 싱글톤 패턴이 적용됨
object CarFactory {
    val cars = mutableListOf<CarInfo>()

    fun makeCar(name : String, type : String) : CarInfo {
        val car = CarInfo(name, type)
        cars.add(car)
        return car
    }
}