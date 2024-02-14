package Lessons;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = sc.nextInt();
        double[] arr = new double[size];
        System.out.println("Add numbers: ");
        for (int i = 0; i < size; i++) {
            double num = sc.nextDouble();
            if (num <= 100 && num > 0) {
                arr[i] = num;
            } else {
                System.out.println("is invalid");
                i--;
            }
        }
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] < 2.5) {
                System.out.println(i + " " + arr[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("not found");
        }

    }
}