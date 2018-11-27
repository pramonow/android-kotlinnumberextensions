package com.pramonow.numbermathextension

fun Int.square():Int {
    return this*this
}

fun Int.cubic():Int {
    return this*this*this
}

fun Int.power(pow:Int):Int{

    var value = this
    repeat(pow-1) {
        value*this
    }

    return value
}

fun Int.absolute():Int {
    if(this < 0)
        return this*-1
    return this
}

fun Int.log():Int {

    var value = 0;
    var originalValue = this

    while(this >= 2)
    {
        originalValue = originalValue/2
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


