package homework_week_5;

import java.util.Arrays;

/*
Write a Java program to reverse an array of integer values
 */
public class Programme_3_Reverse_Array {

    public static void main(String[] args) {
        int[] array = new int[]{23, 45, 34, 54, 67, 78};//single dimension array

        System.out.print("Orignal array : " + Arrays.toString(array));

        Programme_3_Reverse_Array obj = new Programme_3_Reverse_Array();
        System.out.print("Reverse Array");
        obj.reverseAnArray(array);
    }

    //method to reverse an array
    public void reverseAnArray(int[] list) {

        for (int i = 0; i < (list.length) / 2; i++) {
            int temp = list[i];
            list[i] = list[list.length - 1 - i];
            list[list.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(list));
    }
}
