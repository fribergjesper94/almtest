package com.example.springdocker.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Jesper Friberg Spång
 * Date: 2021-05-14
 * Time: 14:25
 * Project: almtest
 * Copyright: MIT
 */
class MyMathCalcTest {


    @Test
    public void addTest () {
        MyMathCalc myMathCalc = new MyMathCalc();
        assertEquals(4,myMathCalc.add(2,2));
        assertNotEquals(3, myMathCalc.add(5,5));
    }

    @Test
    public void multiplyTest () {
        MyMathCalc myMathCalc = new MyMathCalc();
        assertEquals(10, myMathCalc.multiply(5,2));
        assertNotEquals(20, myMathCalc.multiply(3,7));
    }

    @Test
    public void divideTest () {
        MyMathCalc myMathCalc = new MyMathCalc();
        assertEquals(2, myMathCalc.divide(10,5));
        assertNotEquals(1, myMathCalc.divide(100,10));
    }

    @Test
    @DisplayName("Throws an exception when trying to divide by zero")
    // Java doesn't throw an exception if the divide method returns a double or float, it does if it returns an integer.
    public void divideThrowsTest () {
        MyMathCalc myMathCalc = new MyMathCalc();
        assertThrows(ArithmeticException.class, () -> myMathCalc.divide(1,0));
    }

}