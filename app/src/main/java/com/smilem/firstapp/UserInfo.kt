package com.smilem.firstapp

/**
 * 사용자 정보 Data Class
 *
 * getter/setter는 작성하지 않는다.
 * 참고 : https://thdev.tech/androiddev/2017/02/14/Getter-and-Setter/
 *
 * 상속할 때 부모 class로 활용하려면 class 앞에 open을 붙인다.
 * 초기값을 설정해야 자식 class에서 활용하거나 override 한다.
 *
 * 기본적으로 class는 final이다.
 */
open class UserInfo (
        var name : String = "user"
        , var age : Int = 0
        , var userNo : Int = 0
)