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

fun Float.log(logValue:Int = 2):Float {

    var value = 0F
    var valueEach = 0F
    var originalValue = this
    var decimalPoint = 0
    var divider = 10F

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