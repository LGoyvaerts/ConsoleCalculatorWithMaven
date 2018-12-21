package ch.bbw.gol.consolecalculator;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    Calculator calculator;

    @Test
    public void testSummeZeiPositiveIsOk() {
        calculator = new Calculator();
        assertTrue(calculator.addition(10, 25) == 35);
    }
}
