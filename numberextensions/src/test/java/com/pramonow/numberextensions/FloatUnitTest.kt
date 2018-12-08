package com.pramonow.numberextensions

import com.pramonow.numberextensions.*
import junit.framework.Assert.assertTrue
import org.junit.Assert
import org.junit.Test

class FloatUnitTest {

    @Test
    fun squareIsCorrect() {
        var number = 4F
        var anotherNumber = 10F

        if(number.square() == 16F && anotherNumber.square() == 100F)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun cubicIsCorrect() {
        var number = 4F
        var anotherNumber = 10F

        if(number.cubic() == 64F && anotherNumber.cubic() == 1000F)
            assertTrue(true)
        else
            assertTrue(false)
    }

    @Test
    fun powerIsCorrect() {
        var number = 4F

        if(number.power(0) == 1F && number.power(3) == 64F)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun absoluteIsCorrect() {
        var number = 4F
        var anotherNumber = -4F

        if(number.absolute() == 4F && anotherNumber.absolute() == 4F)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun logIsCorrect() {
        var number = 4F
        var anotherNumber = 18F

        if(number.log() == 2 && anotherNumber.log() == 4)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun isNegativeIsCorrect() {
        var number = 2F

        if(number.isNegative() == false)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun isPositiveIsCorrect() {
        var number = 2F

        if(number.isPositive() == true)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun isInverseCorrect() {
        var number = 2F

        if(number.inverse() == 0.5F)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

    @Test
    fun isRoundCorrect() {
        var number = 2.5F
        var anotherNumber = 2.1F

        if(number.round() == 3F && anotherNumber.round() == 2F)
            Assert.assertTrue(true)
        else
            Assert.assertTrue(false)
    }

}