package Lessons;

import java.util.Scanner;
//rectangle2
public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=0){
            for (int i = 0; i < 4; i++) {

                for (int j = 0; j < n; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
    }

    }
}
