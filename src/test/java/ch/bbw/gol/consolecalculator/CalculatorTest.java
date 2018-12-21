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
    public void testSummeNegPosIsOk() {
        assertTrue(calculator.addition((-10), 5) == (-5));
    }

    @Test
    public void testSubtraktionZweiPositiveIsOk() {
        assertTrue(calculator.subtraktion(25, 10) == 15);
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
