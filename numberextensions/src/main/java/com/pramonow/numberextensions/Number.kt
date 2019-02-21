package com.pramonow.numberextensions

import java.lang.Exception

inline fun <reified T: Number> T.check():String {

    var message = StringBuilder()
    var num:Any

    try {
        num = Class.forName(T::class.java.name).getConstructor(T::class.javaPrimitiveType).newInstance(this)
    } catch (e : Exception) {
        return e.toString()
    }

    message.append("This number is instance of ")
    message.append(num.javaClass)
    message.append(", it contains extensions for: ")

    when(num.javaClass.name){
        "java.lang.Integer" -> {message.append(" square, cubic, power, absolute, logarithm, factorial, primeFactors, fibonacci, isNegative, isPositive and isPrime ")}
        "java.lang.Long" -> {message.append(" square, cubic, power, absolute, logarithm, factorial, primeFactors, fibonacci, isNegative, isPositive and isPrime ")}
        "java.lang.Float" -> {message.append(" square, cubic, power, absolute, logarithm, isNegative, isPositive, inverse and round ")}
        "java.lang.Double" -> {message.append(" square, cubic, power, absolute, logarithm, isNegative, isPositive, inverse and round ")}
        else -> {message.append(" none ")}
    }

    message.append("with value of ")
    message.append(num)

    return message.toString()
}
