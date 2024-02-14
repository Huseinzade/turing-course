package Lessons;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Add elements to array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] >= 0) {
                arr[i] = arr[i] + 2;
            }
        }

        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}