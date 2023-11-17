package homework_week_5;

import java.util.Scanner;

/*
Rewrite the student mark sheet programme using if else and while loop. (Week-7 Homework)
 */
public class Programme_2_MarkSheet {

    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name : ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Roll No :");
        int rollNum = scanner.nextInt();

        System.out.print("Enter Marks of Subject Maths :");
        int mathsMarks = scanner.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Please enter correct marks of Maths ");
            mathsMarks = scanner.nextInt();
        }

        System.out.print("Enter Marks of Subject Science :");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Please enter correct marks of Science ");
            scienceMarks = scanner.nextInt();
        }

        System.out.print("Enter Marks of Subject English :");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid input, Marks should between 0 to 100");
            System.out.println("Please enter correct marks of English ");
            englishMarks = scanner.nextInt();
        }

        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);

        //closing scanner
        scanner.close();
    }

    //calculating sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //calculating the result on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "FAIL";
        } else {
            return "PASS";
        }
    }

    //calculating grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;

        if (result.equalsIgnoreCase("pass")) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "-";
        }
        return grade;
    }

    //printing MarkSheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks, int englishMarks, double total, double percentage, String result, String grade) {
        System.out.println("|-------------------------------------------|");
        System.out.println("|                MARK SHEET                 |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|  Name        :  " + name + "                         |");
        System.out.println("|  Roll No     :  " + rollNum + "                  |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|  Subject     :     Marks                  |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|  Maths       :  " + mathsMarks + "               |");
        System.out.println("|  Science     :  " + scienceMarks + "             |");
        System.out.println("|  English     :  " + englishMarks + "             |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|  Total       :  " + total + "                     |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|  Percentage  :  " + percentage + "                   |");
        System.out.println("|  Result      :  " + result + "                    |");
        System.out.println("|  Grade       :  " + grade + "                     |");
        System.out.println("|-------------------------------------------|");
    }
}

