package Lessons;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a=(int) Math.pow(n,2);
        int b=(int) Math.pow(m,2);
        System.out.println(a+b);
    }
}
