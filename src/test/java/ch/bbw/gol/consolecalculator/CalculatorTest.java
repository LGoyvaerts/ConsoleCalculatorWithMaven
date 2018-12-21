package ch.bbw.gol.consolecalculator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    Calculator calculator;

    @Test
    public void testSummeZweiPositiveIsOk() {
        calculator = new Calculator();
        assertTrue(calculator.addition(10, 25) == 35);
    }

    @Test
    public void testSubtraktionZweiPositiveIsOk() {
        calculator = new Calculator();
        assertTrue(calculator.subtraktion(25, 10) == 15);
    }
}
