package com.pramonow.numbermathextension

fun Float.square():Float {
    return this*this
}

fun Float.cubic():Float {
    return this*this*this
}

fun Float.power(pow:Int):Float{

    var value = this
    repeat(pow-1) {
        value*this
    }

    return value
}

fun Float.absolute():Float {
    if(this < 0)
        return this*-1
    return this
}

fun Float.log():Int {

    var value = 0;
    var originalValue = this

    while(this >= 2)
    {
        originalValue = originalValue/2
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