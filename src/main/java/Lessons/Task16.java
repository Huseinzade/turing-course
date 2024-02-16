package Lessons;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int count = 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(count++ + " ");
                }
            } else {
                for (int k = 0; k < n; k++) {
                    System.out.print(count++ + " ");
                }
            }
            System.out.println();
        }


    }
}
