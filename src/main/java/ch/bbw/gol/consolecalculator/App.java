package ch.bbw.gol.consolecalculator;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;

        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();

        System.out.println("What would you like to calculate?\n");
        System.out.println("Plus, Minus, Times or Divide");
        System.out.println("Please write the whole word as your answer:\n");

        valueA = 6;
        valueB = 2;
        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.addition(valueA, valueB));
        System.out.println("Differenz " + valueA + " - " + valueB + " = " + calculator.subtraktion(valueA, valueB));
        System.out.println("Division " + valueA + " / " + valueB + " = " + calculator.division(valueA, valueB));
        System.out.println("Multiplikation " + valueA + " * " + valueB + " = " + calculator.multiplicationTesting(valueA, valueB));
    }
}
