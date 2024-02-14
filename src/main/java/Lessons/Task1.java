package Lessons;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        double squareRoot = Math.sqrt(n);

        if (squareRoot == (int) squareRoot) {
            int m = (int) squareRoot;
            System.out.println("Квадратный корень из " + n + " равен " + m);
        } else {
            System.out.println("Нет");
        }
    }
}
