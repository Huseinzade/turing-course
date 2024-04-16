package Tasks;

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of students: ");
        int n = sc.nextInt();
        int[] arr = generateUniqueRandomNumbers(n);
        String [] name = {"FERID","ISMAYIL","ELDAR","VUSAL","ALI","LEYLA",
                "BAHRUZ","NEZRIN","AYBENIZ","KENAN","FERID","ILHAM","AYDAN","SELEN","NURLAN","BASHIR"};
        for (int i = 0; i < name.length; i++) {
            System.out.print(i +" "+name[i]);
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + " yer " + arr[i]);
        }
    }

    public static int[] generateUniqueRandomNumbers(int count) {
        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            int randomNumber;
            boolean isUnique;

            do {
                isUnique = true;

                randomNumber = (int) (Math.random() * 18) + 1;


                for (int j = 0; j < i; j++) {
                    if (result[j] == randomNumber) {
                        isUnique = false;
                        break;
                    }
                }

            } while (!isUnique);

            result[i] = randomNumber;
        }

        return result;
    }
}
