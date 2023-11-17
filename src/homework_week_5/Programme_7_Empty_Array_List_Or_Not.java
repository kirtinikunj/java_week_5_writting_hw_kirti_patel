package homework_week_5;

import java.util.ArrayList;

/*
Write a Java program to test an array list is empty or not. Define array list with underground tube names
 */
public class Programme_7_Empty_Array_List_Or_Not {

    public void isEmpty() {
        ArrayList<String> tubesName = new ArrayList<>();
        tubesName.add("Bakerloo_Lines");
        tubesName.add("Central_Lines");
        tubesName.add("Circle_Lines");
        tubesName.add("District_Lines");
        tubesName.add("Hammersmith_and_City_Lines");
        tubesName.add("Jubilee_Lines");
        tubesName.add("Metropolitan_Lines");
        tubesName.add("Northern_Lines");
        tubesName.add("Piccadilly_Lines");
        tubesName.add("Victoria_Lines");
        tubesName.add("Waterloo_and_City_Lines");

        System.out.println("Given Array List : " + tubesName);

        if (tubesName.isEmpty()) {
            System.out.println("Given Array list is empty!!");
        } else {
            System.out.println("Given Array list is not empty!!");
        }
    }

    public static void main(String[] args) {
        Programme_7_Empty_Array_List_Or_Not obj = new Programme_7_Empty_Array_List_Or_Not();
        obj.isEmpty();
    }
}
