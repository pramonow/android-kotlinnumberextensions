package com.pramonow.numberextensions

import com.pramonow.numberextensions.*
import org.junit.Test
import org.junit.Assert.*

class IntegerUnitTest {

    @Test
    fun squareIsCorrect() {
        var number = 4
        var anotherNumber = 10

        if(number.square() == 16 && anotherNumber.square() == 100)
            assertTrue(true)
        else
            assertTrue(false)
    }

    var integerNumber = 5;
    var powerNumber = integerNumber.square() //25

    @Test
    fun cubicIsCorrect() {
        var number = 4
        var anotherNumber = 10

        if(number.cubic() == 64 && anotherNumber.cubic() == 1000)
            assertTrue(true)
        else
            assertTrue(false)
    }

    @Test
    fun powerIsCorrect() {
        var number = 4

        if(number.power(0) == 1 && number.power(3) == 64)
            assertTrue(true)
        else
            assertTrue(false)
    }

    @Test
    fun absoluteIsCorrect() {
        var number = 4
        var anotherNumber = -4

        if(number.absolute() == 4 && anotherNumber.absolute() == 4)
            assertTrue(true)
        else
            assertTrue(false)
    }

    @Test
    fun logIsCorrect() {
        var number = 4
        var anotherNumber = 18

        if(number.log() == 2 && anotherNumber.log() == 4)
            assertTrue(true)
        else
            assertTrue(false)
    }

    @Test
    fun factorialIsCorrect() {
        var number = 4

        if(number.factorial() == 24)
            assertTrue(true)
        else
            assertTrue(false)
    }

    @Test
    fun primeFactorIsCorrect() {
        var number = 6
        var primeList = number.primeFactor()

        if(primeList.size == 2 && primeList[0] == 2 && primeList[1] == 3)
            assertTrue(true)
        else
            assertTrue(false)
    }

    @Test
    fun fibonacciIsCorrect() {
        var number = 2
        var anotherNumber = 5

        if(number.fibonacci() == 1 && anotherNumber.fibonacci() == 5)
            assertTrue(true)
        else
            assertTrue(false)
    }

    @Test
    fun isNegativeIsCorrect() {
        var number = 2

        if(number.isNegative() == false)
            assertTrue(true)
        else
            assertTrue(false)
    }

    @Test
    fun isPositiveIsCorrect() {
        var number = 2

        if(number.isPositive() == true)
            assertTrue(true)
        else
            assertTrue(false)
    }

    @Test
    fun isPrimeCorrect() {
        var number = 17
        var anotherNumber = 21

        if(number.isPrime() == true && anotherNumber.isPrime() == false)
            assertTrue(true)
        else
            assertTrue(false)
    }

}
