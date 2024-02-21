package Lessons;

import java.util.Arrays;

public class Task19 {

    public static int[] addElement (int [] arr, int element){
       int [] newArr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length -1] = element;
        return newArr;
    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int [] arr1 = addElement(arr,7);
        System.out.println(Arrays.toString(addElement(arr,6)));
        System.out.println(Arrays.toString(arr1));
    }

}
