package com.pramonow.numberextensions

fun Float.square():Float {
    return this*this
}

fun Float.cubic():Float {
    return this*this*this
}

fun Float.power(pow:Int):Float{

    var value = 1F
    repeat(pow) {
        value = value*this
    }

    return value
}

fun Float.absolute():Float {
    if(this < 0)
        return this*-1
    return this
}

fun Float.log(logValue:Int = 2):Int {

    var value = 0;
    var originalValue = this

    while(originalValue >= logValue)
    {
        originalValue = originalValue/logValue
        value++
    }

    return value
}

fun Float.isNegative():Boolean{
    if(this < 0) return true
    return false
}

fun Float.isPositive():Boolean{
    if(this < 0) return false
    return true
}

fun Float.inverse():Float{
    return 1/this
}

fun Float.round():Float{
    var value = (this + 0.5).toInt()

    return value.toFloat()
}