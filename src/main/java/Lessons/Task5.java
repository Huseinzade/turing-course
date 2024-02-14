package Lessons;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long firstPow = (long) Math.pow(n,2);
        long secondPow = (long) Math.pow(m,2);
        System.out.println(firstPow + secondPow);
    }
}
