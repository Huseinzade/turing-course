package Lessons;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("add numbers: ");
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            if (num > 0 && num <= 100) {
                arr[i] = num;
            } else {
                System.out.println("invalid number");
                i--;
            }
        }
        //find divisible to 6 and required number
        int sum = 0;
        boolean found = false;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 6 == 0) {
                sum = sum + arr[i];
                found = true;
                count++;
            }
        }

        if (found) {
            System.out.println(count + " " + sum);
        } else {
            System.out.println("not found");
        }

    }
}
