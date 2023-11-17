package programme_1_caculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declaring scanner
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.print("Please enter first number : ");//input wizard
            int a = scanner.nextInt();
            System.out.print("Please enter second number : ");
            int b = scanner.nextInt();
            System.out.print("Please enter symbol +,-,*,/ : ");
            char symbol = scanner.next().charAt(0);

            Calculator calculator = new Calculator();
            calculator.calculateResult(a, b, symbol);

            System.out.print("Would like to do more calculation, Please enter 'Y' or 'N' :");
            answer = scanner.next().toLowerCase(Locale.ROOT);
        }
        while (answer.startsWith("y"));

        //closing scanner
        scanner.close();
    }
}
