package ch.bbw.gol.consolecalculator;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;

        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();

        valueA = 6;
        valueB = 2;
        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.addition(valueA, valueB));
        System.out.println("Differenz " + valueA + " - " + valueB + " = " + calculator.subtraktion(valueA, valueB));
        System.out.println("Division " + valueA + " / " + valueB + " = " + calculator.division(valueA, valueB));
    }
}
