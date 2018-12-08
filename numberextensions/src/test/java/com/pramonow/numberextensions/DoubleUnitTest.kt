package com.pramonow.numberextensions

import com.pramonow.numberextensions.*
import org.junit.Assert
import org.junit.Test

class DoubleUnitTest {

    @Test
    fun squareIsCorrect() {
        var number = 4.0
        var anotherNumber = 10.0

        if(number.square() == 16.0 && anotherNumber.square() == 100.0)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun cubicIsCorrect() {
        var number = 4.0
        var anotherNumber = 10.0

        if(number.cubic() == 64.0 && anotherNumber.cubic() == 1000.0)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun powerIsCorrect() {
        var number = 4.0

        if(number.power(0) == 1.0 && number.power(3) == 64.0)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun absoluteIsCorrect() {
        var number = 4.0
        var anotherNumber = -4.0

        if(number.absolute() == 4.0 && anotherNumber.absolute() == 4.0)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun logIsCorrect() {
        var number = 4.0
        var anotherNumber = 18.0

        if(number.log() == 2 && anotherNumber.log() == 4)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun isNegativeIsCorrect() {
        var number = 2.0

        if(number.isNegative() == false)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun isPositiveIsCorrect() {
        var number = 2.0

        if(number.isPositive() == true)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun isInverseCorrect() {
        var number = 2.0

        if(number.inverse() == 0.5)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun isRoundCorrect() {
        var number = 2.5
        var anotherNumber = 2.1

        if(number.round() == 3.0 && anotherNumber.round() == 2.0)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

}