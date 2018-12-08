package com.pramonow.numberextensions

import com.pramonow.numberextensions.*
import org.junit.Assert
import org.junit.Test

class LongUnitTest {

    @Test
    fun squareIsCorrect() {
        var number = 4L
        var anotherNumber = 10L

        if(number.square() == 16L && anotherNumber.square() == 100L)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun cubicIsCorrect() {
        var number = 4L
        var anotherNumber = 10L

        if(number.cubic() == 64L && anotherNumber.cubic() == 1000L)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun powerIsCorrect() {
        var number = 4L

        if(number.power(0) == 1L && number.power(3) == 64L)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun absoluteIsCorrect() {
        var number = 4L
        var anotherNumber = -4L

        if(number.absolute() == 4L && anotherNumber.absolute() == 4L)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun logIsCorrect() {
        var number = 4L
        var anotherNumber = 18L

        if(number.log() == 2 && anotherNumber.log() == 4)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun factorialIsCorrect() {
        var number = 4L

        if(number.factorial() == 24L)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun primeFactorIsCorrect() {
        var number = 6L
        var primeList = number.primeFactor()

        if(primeList.size == 2 && primeList[0] == 2L && primeList[1] == 3L)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun fibonacciIsCorrect() {
        var number = 2L
        var anotherNumber = 5L

        if(number.fibonacci() == 1L && anotherNumber.fibonacci() == 5L)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun isNegativeIsCorrect() {
        var number = 2L

        if(number.isNegative() == false)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun isPositiveIsCorrect() {
        var number = 2L

        if(number.isPositive() == true)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun isPrimeCorrect() {
        var number = 17L
        var anotherNumber = 21L

        if(number.isPrime() == true && anotherNumber.isPrime() == false)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

}