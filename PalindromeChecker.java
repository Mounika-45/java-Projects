package xyz;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(word).reverse();

        if (word.equalsIgnoreCase(reversed.toString())) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }
}
