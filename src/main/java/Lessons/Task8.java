package Lessons;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");


        if (scanner.hasNextLong()) {
            long n = scanner.nextLong();


            if (n > 0) {
                double squareRoot = Math.sqrt(n);

                if (squareRoot == (long) squareRoot) {
                    long m = (long) squareRoot;
                    System.out.println("m: " + m);
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("Please enter a positive integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid positive integer.");
        }


    }
}
