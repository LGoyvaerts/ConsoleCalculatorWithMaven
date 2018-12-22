package ch.bbw.gol.consolecalculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        while (true) {
            Scanner in = new Scanner(System.in);

            String function;
            int valueA = 0;
            int valueB = 0;
            int solution = 0;

            System.out.println("Console Calculator");
            System.out.println("==================");
            System.out.println();

            System.out.println("What would you like to calculate?\n");
            System.out.println("Plus, Minus, Times or Divide");
            System.out.println("You can also exit by typing exit");
            System.out.println("Please write the whole word as your answer:\n");

            function = in.nextLine().toLowerCase();

            if (function.equals("exit")) {
                System.out.println("\nGOOD BYE");
                break;
            }

            System.out.println("\n------------------\n");
            System.out.print("This is your first value: ");
            valueA = in.nextInt();
            System.out.println("");
            System.out.print("This is your second value: ");
            valueB = in.nextInt();
            System.out.println("\n----CALCULATING----\n");

            if (function.equals("plus")) {
                solution = calculator.addition(valueA, valueB);
                System.out.println("Summe " + valueA + " + " + valueB + " = " + solution);
                if (solution > 0) {
                    printBinaryform(solution);
                }
            } else if (function.equals("minus")) {
                System.out.println("Differenz " + valueA + " - " + valueB + " = " + calculator.subtraktion(valueA, valueB));
            } else if (function.equals("times")) {
                System.out.println("Multiplikation " + valueA + " * " + valueB + " = " + calculator.multiplicationTesting(valueA, valueB));
            } else if (function.equals("divide")) {
                System.out.println("Division " + valueA + " / " + valueB + " = " + calculator.division(valueA, valueB));
            } else {
                System.out.println("Please choose one of the given functions");
            }

            System.out.println("\n==================\n");
        }
    }

    private static void printBinaryform(int number) {
        int remainder;

        if (number <= 1) {
            System.out.print(number);
            return; // KICK OUT OF THE RECURSION
        }

        remainder = number % 2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }
}
