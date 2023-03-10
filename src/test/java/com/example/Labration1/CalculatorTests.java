package com.example.Labration1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTests {


    Calculator calc = new Calculator();



    @Test
    void AddTwoNumbersToGetTheResult() {

        int a = 3;
        int b = 4;

        int acutal = calc.add(a,b);
        int expected = 7;

        Assertions.assertEquals(expected, acutal);
    }

    @Test
    void SubtractNumbersWithEachother() {

        int a = 6;
        int b = 3;

        int result = calc.subtract(a,b);

        Assertions.assertEquals(3,result);
    }

    @Test
    void MultiplyToGetTheResult() {

        int a = 4;
        int b = 4;

        int actual = calc.multiply(a,b);
        int expected = 16;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    void multiplyTwoNumbers() {

        int a = 7;
        int b = 2;

        int result = calc.multiply(a,b);

        Assertions.assertEquals(14,result);
    }

    @Test
    void TestDoubleDivide() {

        double expected = 256;
        double actual = calc.divide(1024,4);

        Assertions.assertEquals(expected,actual,0);

    }

    @Test
    void findTheSquareRootOf() {

        double expected = 16;
        double actual = calc.squareRootOf(256);

        Assertions.assertEquals(expected, actual, 0);

    }

    @Test
    void getTheAreaNumber() {

        double expected = 113.04;
        double actual = calc.getArea(6);

        Assertions.assertEquals(expected,actual,0.1);

    }

    @Test
    void getCircumference() {
        double expected = 803.84;
        double actual = calc.getCircumference(128);

        Assertions.assertEquals(expected,actual,0.5);
    }



}
