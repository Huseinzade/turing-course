package Lessons;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digital number: ");
        int number = sc.nextInt();

        if (99<number && number <1000 ){
            int num1 = number % 10;
            int num2 = (number / 10) % 10;
            int num3 = number / 100;
            int result = num1 * num2 * num3;
            System.out.println(result);
        }else{
            System.out.println("invalid number");
        }
    }
}
