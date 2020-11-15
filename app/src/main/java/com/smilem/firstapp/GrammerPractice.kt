package com.smilem.firstapp

/**
 * 시작함수
 */
fun main() {
//    helloWorld()
//    println(add(4,5))
//    testStringTemplate()
    // Ctrl + Alt + L 을 하면 코드 자동정리 해줌...
//    conditionTest()
//    conditionTest2()
//    arrayTest()
//    loopTest()
//    nullTest()
//    simpleThreeItems(null)
//    letTest(null)
//    letTest("cremazer@gmail.com")

//    classTest()
//    inheritanceClassTest()
//    dataClassTest()

//    lambdaTest()

//    companionObjectTest()

    objectTest()
}

fun objectTest() {
    val car1 = CarFactory.makeCar("소나타","승용차")
    val car2 = CarFactory.makeCar("덤프","트럭")

    println(CarFactory.cars.size.toString())
}

fun companionObjectTest() {
    // static 역할을 함?
    // 이름이 생기면 Companion을 사용하지 않음...
//    val book = Book.Companion.create()
    val book = Book.create()

    println("${book.id} ${book.name}")
}

fun lambdaTest() {
//    println(square(11))
//    println(mul(5, 6))
//    println(userInfo("cremazer", 39))

    // 확장함수
//    val my = "My"
//    println(my.studyIsGood())
//    println(introduce("cremazer", 39))
//    println(getGrade(90))

    // 익명내부함수

}

val getGrade : (Int) -> String = {
    when(it) {
        in 0..50 -> "C"
        in 51..80 -> "B"
        in 81..100 -> "A"
        else -> "Umm..."
    }
}

fun introduce(name: String, age: Int): String {
    val introduceMyself: String.(Int) -> String = {
        "I'm ${this} and ${it} years old."
    }
    return name.introduceMyself(age)
}

val studyIsGood: String.() -> String = {
    this + " study is good."
}

//val square : (Int) -> (Int) = {number -> number * number}
val square = { number: Int -> number * number }
val mul = { num1: Int, num2: Int -> num1 * num2 }
val userInfo = { name: String, age: Int ->
    "My name is ${name}, I'm ${age}"
}

/**
 * data class는 toString이 자동으로 처리된다.
 */
fun dataClassTest() {
    var carInfo = CarInfo("소나타", "승용차")

    println(carInfo.name)
    println(carInfo.toString())
}

fun inheritanceClassTest() {
    val memberInfo = MemberInfo()
    memberInfo.name = "cremazer"
    memberInfo.age = 39
    memberInfo.userNo = 1
    memberInfo.level = 99

    println(memberInfo.name)
    println(memberInfo.toString())
}

/**
 * UserInfo Class 파일을 작성한 후 테스트 함.
 *
 */
fun classTest() {
    val userInfo = UserInfo("cremazer", 39, 1)
//    println(userInfo)

    // 변수에 직접 접근한다...
    println(userInfo.name)
    println(userInfo.toString())

    /*
    cremazer
    UserInfo(name=cremazer, age=39, userNo=1)
     */
//    println(userInfo.age)
//    println(userInfo.userNo)
}

/**
 * let 테스트
 */
fun letTest(email: String?) {
//    var email = "cremazer@gmail.com"

    email?.let {
        println("My email is ${email}")
    }
}

/**
 * 삼항연산자 간단히 표현하기
 */
fun simpleThreeItems(nation: String?) {

    var city = "Seoul"

    // java의 삼항연산자를 이렇게 줄여서 표현함.
    // 엘비스 프레슬리 연산자 ?:
//    println(city + (nation == null ? "" : ", Korea"))
    println(city + (nation ?: ", Korea"))
}

/**
 * NonNull & Nullable
 */
fun nullTest() {
    var name = "cremazer"

    var nullName = null

    println("name=" + name)
    println("nullName=" + nullName)

    println(getUpperCase(name))
    println(getUpperCase(nullName))
}

/**
 * 파라미터 name이 null이 전달될 경우 타입 String 뒤에 ? 가 붙음.
 * java와 달리 compile 시점에서 NullPointException을 catch 해줌.
 * return 값도 null일 경우 return 타입 String 뒤에 ? 붙여야 함.
 */
fun getUpperCase(name: String?): String? {
//    if (name != null) {
//        return name.toUpperCase()
//    } else {
//        return name
//    }

    // 간단하게
    return name?.toUpperCase()
}

/**
 * 반복문 테스트
 */
fun loopTest() {
//    for (data in 1..10) {
//        println(data)
//    }

//    for (data in 1..10 step 2) {
//        println(data)
//    }

//    for (data in 10 downTo 1) {
//        println(data)
//    }

    var idx = 0
    while (idx < 10) {
        println(idx++)
    }

}

/**
 * 배열/리스트 테스트
 */
fun arrayTest() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "a", 1.1f)
    val list2 = listOf(1, "a", 1.1f)


    for (data in array2) {
        println(data)
    }
}

/**
 * 조건식 When 테스트
 */
fun conditionTest2() {
    var score = 100

    // when은 switch랑 비슷한가?
    when (score) {
        50 -> println("50")
    }

    var level = when (score) {
        in 0..50 -> println("C")
        in 50..80 -> println("B")
        in 8..100 -> println("A")
        else -> println("over")
    }
}

/**
 * 조건식 테스트
 */
fun conditionTest() {
    var a = 10
    var b = 20

    println(maxBy(a, b))
}

/**
 * 큰 수 구하기
 */
fun maxBy(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

/**
 * 문자 템플릿
 */
fun testStringTemplate() {
    val name = "cremaer"
    val familyName = "Shim"
    println("My name is $name") // $를 사용하여 문자열에 변수값을 설정할 수 있음.
    println("제 이름은 ${name}입니다.") // {}를 사용해 연결할 수 있음..
    println("제 이름은 ${name + familyName}입니다.") // {}를 사용해 연결할 수 있음..
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
fun add(a: Int, b: Int): Int {
    return a + b
}

/**
 * val : 상수, 변하지 않음
 * var : 변수, 변함
 */
fun valandvar() {
    val a: Int = 10
    var b: Int = 10

    var e: String

//    a = 20 // 컴파일 오류
    b = 100

    val c = 10
    var d = 10

    var name = "cremazer"
}

