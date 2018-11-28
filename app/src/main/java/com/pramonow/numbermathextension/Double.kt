package com.pramonow.numbermathextension

fun Double.square():Double {
    return this*this
}

fun Double.cubic():Double {
    return this*this*this
}

fun Double.power(pow:Int):Double{

    var value = this
    repeat(pow-1) {
        value*this
    }

    return value
}

fun Double.absolute():Double {
    if(this < 0)
        return this*-1
    return this
}

fun Double.log():Int {

    var value = 0;
    var originalValue = this

    while(this >= 2)
    {
        originalValue = originalValue/2
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