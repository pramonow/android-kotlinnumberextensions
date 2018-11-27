package com.pramonow.numbermathextension

fun Int.square():Int {

    this.times(this)
    return this
}

fun Int.cubic():Int {
    this.times(this).times(this)
    return this
}

fun Int.power(pow:Int):Int{

    repeat(pow-1) {
        this.times(this)
    }

    return this
}

fun Int.absolute():Int {
    if(this < 0)
        return this.times(-1)

    return this
}

