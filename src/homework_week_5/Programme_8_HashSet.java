package homework_week_5;

import java.util.HashSet;

/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)
 */
public class Programme_8_HashSet {

    public static void main(String[] args) {

        //create hashset
        HashSet<Integer> numbers = new HashSet<Integer>();

        //add values
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        //show which number between 1 to 10 are in set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(i + " is found in the set");
            } else {
                System.out.println(i + " is not found in the set");
            }
        }
    }
}
