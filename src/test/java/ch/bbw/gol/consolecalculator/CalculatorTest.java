package ch.bbw.gol.consolecalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    //Addition
    @Test
    public void testSummeZweiPositiveIsOk() {
        assertTrue(calculator.addition(10, 25) == 35);
    }

    @Test
    public void testSummeZweiNegativeIsOk() {
        assertTrue(calculator.addition((-10), -8) == (-18));
    }

    @Test
    public void testsummePosNegIsOk() {
        assertTrue(calculator.addition(5, (-10)) == (-5));
    }

    @Test
    public void testSummeNegPosIsOk() {
        assertTrue(calculator.addition((-10), 5) == (-5));
    }

    @Test
    public void testSummeMaxPlusOneIsOk() {
        assertTrue(calculator.addition(Integer.MAX_VALUE, 1) == Integer.MIN_VALUE);
    }

    @Test
    public void testSummeMinPlusMinusOneOneIsOk() {
        assertTrue(calculator.addition(Integer.MIN_VALUE, (-1)) == Integer.MAX_VALUE);
    }

    @Test
    public void testSummeMaxPlusMinIsOk() {
        assertTrue(calculator.addition(Integer.MAX_VALUE, Integer.MIN_VALUE) == (-1));
    }

    @Test
    public void testSummeMaxPlusMinusMinIsOk() {
        assertTrue(calculator.addition(Integer.MAX_VALUE, (-Integer.MIN_VALUE)) == (-1));
    }

    //Subtraction
    @Test
    public void testSubtraktionZweiPositiveIsOk() {
        assertTrue(calculator.subtraktion(25, 10) == 15);
    }

    @Test
    public void testSubtraktionZweiNegativeIsOk() {
        assertTrue(calculator.subtraktion((-5), (-5)) == 0);
    }

    @Test
    public void testSubtraktionPosNegIsOk() {
        assertTrue(calculator.subtraktion(5, (-5)) == 10);
    }

    @Test
    public void testSubtraktionNegPosIsOk() {
        assertTrue(calculator.subtraktion((-5), 5) == (-10));
    }

    @Test
    public void testSubtraktionMaxMinusMinIsOk() {
        assertTrue(calculator.subtraktion(Integer.MAX_VALUE, Integer.MIN_VALUE) == (-1));
    }

    @Test
    public void testSubtraktionMaxMinusMinusMinIsOk() {
        assertTrue(calculator.subtraktion(Integer.MAX_VALUE, (-Integer.MIN_VALUE)) == (-1));
    }

    @Test
    public void testSubtraktionMinMinusMaxIsOk() {
        assertTrue(calculator.subtraktion(Integer.MIN_VALUE, (-Integer.MAX_VALUE)) == (-1));
    }

    @Test
    public void testSubtraktionMinusMinMinusMaxIsOk() {
        assertTrue(calculator.subtraktion((-Integer.MIN_VALUE), Integer.MAX_VALUE) == 1);
    }

    @Test
    public void testDivisionZweiPositiveIsOk() {
        assertTrue(calculator.division(6, 2) == 3);
    }

    @Test
    public void testMultiplicationZweiPositiveIsOk() {
        assertTrue(calculator.multiplication(2, 3) == 6);
    }
}
