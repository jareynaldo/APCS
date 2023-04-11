// The purpose of this porjct is to practice recursive 
// methods by finding digits of the Fibonacci sequence. 
//
//By: Jose Reynaldo
// 10/4/23

import java.util.Scanner;

public class Fibonacci {
    public int calculate(int n) {
        // Base cases
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        // Recursive calculation
        return calculate(n - 1) + calculate(n - 2);
    }

    public static void main(String[] args) {
        // Introduction
        System.out.println("Welcome to the Fibonacci Calculator!");
        System.out.println("This program calculates the nth Fibonacci number for a given value of n.");
        System.out.println("Please enter a positive integer value for n (0 to 44):");

        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();

        while (true) {

            System.out.print("n = ");
            int n;
            while (!scanner.hasNextInt()) {

                System.out.print("n = ");
                scanner.next();
            }
            n = scanner.nextInt();

            if (n < 0 || n > 44) {
                System.out.println("Error: Please enter a number between 0 and 44.");

            }

            int number = fibonacci.calculate(n);
            System.out.println("The Fibonacci number for n = " + n + " is: " + number);

            System.out.print("Do you want to calculate another Fibonacci number? (y/n): ");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("y")) {
                break;
            }
        }

    }

}
