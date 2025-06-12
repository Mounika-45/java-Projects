package xyz;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryNameSearch {
    public static void main(String[] args) {
        // Sorted array of names
        String[] names = {"Amit", "Divya", "Karan", "Priya", "Zoya"};

        // Ask user to enter a name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search: ");
        String inputName = scanner.nextLine();

        // Perform binary search
        int index = Arrays.binarySearch(names, inputName);

        // Check and print result
        if (index >= 0) {
            System.out.println(inputName + " found at index " + index + ".");
        } else {
            System.out.println(inputName + " not found in the list.");
        }

        scanner.close();
    }
}



