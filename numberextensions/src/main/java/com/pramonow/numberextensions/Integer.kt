package com.pramonow.numberextensions

fun Int.square():Int {
    return this*this
}

fun Int.cubic():Int {
    return this*this*this
}

fun Int.power(pow:Int):Int{

    var value = 1
    repeat(pow) {
        value = value*this
    }

    return value
}

fun Int.absolute():Int {
    if(this < 0)
        return this*-1
    return this
}

fun Int.log(logValue:Int = 2):Int {

    var value = 0;
    var originalValue = this

    while(originalValue >= logValue)
    {
        originalValue = originalValue/logValue
        value++
    }

    return value
}

fun Int.factorial():Int{

    if(this <= 1) return 1

    var value = 1

    for(i in 1..this)
        value = value*i

    return value
}

fun Int.primeFactor():List<Int>{

    var primeList = ArrayList<Int>()
    var value:Int = this

    for (i in 2 until value) {
        while (value % i === 0) {
            primeList.add(i)
            value = value / i
        }
    }

    return primeList
}

fun Int.fibonacci():Int{

    var value:Int = 1
    var prevValue:Int = 0

    if(this == 1 || this == 2)
        return 1

    for(i in 3..this)
    {
        prevValue = value - prevValue
        value = value + prevValue
    }

    return value
}

fun Int.isNegative():Boolean{
    if(this < 0) return true
    return false
}

fun Int.isPositive():Boolean{
    if(this < 0) return false
    return true
}

fun Int.isPrime():Boolean{

    if(this <= 1 || this%2 == 0)
        return false

    for (i in 3..this/2 step 2)
    {
        if(this % i == 0)
            return false
    }

    return true
}

