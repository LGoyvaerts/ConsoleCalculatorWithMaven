package ch.bbw.gol.consolecalculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String function;
        int valueA = 0;
        int valueB = 0;

        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();

        System.out.println("What would you like to calculate?\n");
        System.out.println("Plus, Minus, Times or Divide");
        System.out.println("Please write the whole word as your answer:\n");

        function = in.nextLine().toLowerCase();

        System.out.println("\n------------------\n");
        System.out.print("This is your first value: ");
        valueA = in.nextInt();
        System.out.println("");
        System.out.print("This is your second value: ");
        valueB = in.nextInt();
        System.out.println("\n----CALCULATING----\n");

        if (function.equals("plus")) {
            System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.addition(valueA, valueB));
        } else if (function.equals("minus")) {
            System.out.println("Differenz " + valueA + " - " + valueB + " = " + calculator.subtraktion(valueA, valueB));
        } else if (function.equals("times")) {
            System.out.println("Multiplikation " + valueA + " * " + valueB + " = " + calculator.multiplicationTesting(valueA, valueB));
        } else if (function.equals("divide")) {
            System.out.println("Division " + valueA + " / " + valueB + " = " + calculator.division(valueA, valueB));
        } else {
            System.out.println("Please choose one of the given functions");
        }
    }
}
