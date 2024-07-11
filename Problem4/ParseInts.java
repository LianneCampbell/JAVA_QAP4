package Problem4;

import java.util.Scanner;

// ParseInts.java
//
// Reads a line of text and prints the integers in the line.
//
public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in); // Scanner for standard input
        String line;

        System.out.println("Enter a line of text:");
        line = scan.nextLine(); // Read a line of text from the user
        Scanner scanLine = new Scanner(line); // Scanner to read tokens from the line

        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next()); // Attempt to parse the next token as an integer
                sum += val; // Add the parsed integer to the sum
            } catch (NumberFormatException e) {
                // Catch NumberFormatException if the token is not a valid integer
                // Do nothing here to skip non-integer tokens
            }
        }

        // Print the sum of integers found in the line
        System.out.println("The sum of the integers on this line is " + sum);

        // Close the scanners to release resources
        scan.close();
        scanLine.close();
    }
}