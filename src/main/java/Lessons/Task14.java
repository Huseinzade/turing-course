package Lessons;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 1 && num > (int) Math.pow(10, 9)) {
            return;
        }
        int changes = calculateChanges(num);
        System.out.println(changes);
    }

    public static int calculateChanges(int n) {
        int count = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n += 1;
            }
            count++;
        }
        return count;
    }


}
