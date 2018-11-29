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

fun Double.log(logValue:Int = 2):Double {

    var value = 0.0
    var valueEach = 0.0
    var originalValue = this
    var decimalPoint = 0
    var divider = 10.0

    while(decimalPoint < 5) {
        while (this >= logValue) {
            originalValue = originalValue / logValue
            valueEach++
        }

        value = value + valueEach/divider.power(decimalPoint)
        decimalPoint++;
        originalValue = originalValue.power(logValue)
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