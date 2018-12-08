package com.pramonow.numberextensions

fun Double.square():Double {
    return this*this
}

fun Double.cubic():Double {
    return this*this*this
}

fun Double.power(pow:Int):Double{

    var value = 1.0
    repeat(pow) {
        value = value*this
    }

    return value
}

fun Double.absolute():Double {
    if(this < 0)
        return this*-1
    return this
}

fun Double.log(logValue:Int = 2):Int {

    var value = 0;
    var originalValue = this

    while(originalValue >= logValue)
    {
        originalValue = originalValue/logValue
        value++
    }

    return value
}

fun Double.isNegative():Boolean{
    if(this < 0) return true
    return false
}

fun Double.isPositive():Boolean{
    if(this < 0) return false
    return true
}

fun Double.inverse():Double{
    return 1/this
}

fun Double.round():Double{
    var value = (this + 0.5).toInt()

    return value.toDouble()
}