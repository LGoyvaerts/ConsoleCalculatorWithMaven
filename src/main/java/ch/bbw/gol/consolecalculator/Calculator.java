package ch.bbw.gol.consolecalculator;

public class Calculator {

    public int addition(int summand1, int summand2) {
        return summand1 + summand2;
    }

    protected int subtraktion(int value1, int value2) {
        return value1 - value2;
    }

    double division(int dividend, int divisor) {
        return dividend / divisor;
    }

    public int multiplication(int multiplikant, int multiplikator) {
        return multiplikant * multiplikator;
    }
}
