package com.pramonow.numbermathextension

fun Long.square():Long {
    return this*this
}

fun Long.cubic():Long {
    return this*this*this
}

fun Long.power(pow:Int):Long{

    var value = 1L
    repeat(pow) {
        value = value*this
    }

    return value
}

fun Long.absolute():Long {
    if(this < 0)
        return this*-1
    return this
}

fun Long.log(logValue:Int = 2):Int {

    var value = 0;
    var originalValue = this

    while(originalValue >= logValue)
    {
        originalValue = originalValue/logValue
        value++
    }

    return value
}

fun Long.factorial():Long{

    if(this <= 1) return 1

    var value = 1L

    for(i in 1..this)
        value = value*i

    return value
}

fun Long.primeFactor():List<Long>{

    var primeList = ArrayList<Long>()
    var value:Long = this

    for (i in 2 until value) {
        while (value % i === 0L) {
            primeList.add(i)
            value = value / i
        }
    }

    return primeList
}

fun Long.fibonacci():Long{

    var value:Long = 1L
    var prevValue:Long = 0L

    if(this == 1L || this == 2L)
        return 1L

    for(i in 3..this)
    {
        prevValue = value - prevValue
        value = value + prevValue
    }

    return value
}

fun Long.isNegative():Boolean{
    if(this < 0) return true
    return false
}

fun Long.isPositive():Boolean{
    if(this < 0) return false
    return true
}

fun Long.isPrime():Boolean{

    if(this <= 1 || this%2 == 0L)
        return false

    for (i in 3..this/2 step 2)
    {
        if(this % i == 0L)
            return false
    }

    return true
}