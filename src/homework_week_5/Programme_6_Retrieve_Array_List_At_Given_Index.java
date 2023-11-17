package homework_week_5;

import java.util.ArrayList;
import java.util.Scanner;

/*
Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Programme_6_Retrieve_Array_List_At_Given_Index {

    public static void main(String[] args) {

        ArrayList<String> vegetableList = new ArrayList<>();

        vegetableList.add("CUCUMBER");
        vegetableList.add("POTATO");
        vegetableList.add("CAULIFLOWER");
        vegetableList.add("BRINGLE");
        vegetableList.add("ONION");
        vegetableList.add("BEETROOT");
        vegetableList.add("MUSHROOM");
        vegetableList.add("BITTER_GOURD");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an index number : ");
        int indexNumber = scan.nextInt();

        if (indexNumber < vegetableList.size()) {
            System.out.println(vegetableList.get(indexNumber));
        } else {
            System.out.println("Invalid Index Number!!!");
        }
        scan.close();
    }
}
