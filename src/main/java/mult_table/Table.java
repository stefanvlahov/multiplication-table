package mult_table;

import java.util.Scanner;

public class Table {

    public static int calc(int operand1, int operand2) {
        int result = operand1 * operand2;
        return result;
    }

    public static void generateTable() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to see its multiplication table: ");

        int userNumber = scan.nextInt();
        int counter;

        for (counter = 0; counter < 13; counter++) {
            int product = calc(userNumber, counter);
            System.out.println(userNumber + " * " + counter + " = " + product);
        }
    }
}
