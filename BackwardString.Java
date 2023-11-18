package chapter8;
/*Calvin Rhodes
 * Chapter 8
 * Programming Challenge 1
 * Backward String
 */

import java.util.Scanner;

public class BackwardString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Display the backward string
        System.out.println("Backward string: " + backwardString(inputString));
    }

    // Method to display a string backward
    private static String backwardString(String input) {
        // Convert the string to a StringBuilder and use reverse() method
        return new StringBuilder(input).reverse().toString();
    }
}
