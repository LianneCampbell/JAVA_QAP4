package Problem3;

import java.util.Scanner;

// CountLetters.java
//
// Reads a word from the standard input and prints the number of
// occurrences of each letter in that word.
//
public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26]; // Array to count occurrences of each letter ('A' to 'Z')
        Scanner scan = new Scanner(System.in); // Scanner for standard input

        try {
            // Get word from user
            System.out.print("Enter a single word (letters only, please): ");
            String word = scan.nextLine();

            // Convert to all upper case
            word = word.toUpperCase();

            // Count frequency of each letter in string
            for (int i = 0; i < word.length(); i++) {
                try {
                    counts[word.charAt(i) - 'A']++; // Increment count for the corresponding letter
                } catch (ArrayIndexOutOfBoundsException e) {
                    // Catch exception if character is not a letter (not in 'A' to 'Z')
                    System.out.println("Not a letter: " + word.charAt(i));
                }
            }

            // Print frequencies of letters found
            System.out.println();
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] != 0) {
                    System.out.println((char) (i + 'A') + ": " + counts[i]);
                }
            }
        } finally {
            // Close the scanner to release resources
            scan.close();
        }
    }
}