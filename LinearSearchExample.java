package xyz;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 9, 3, 5}; // array to search
        int target = 2;                     // value to find
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number " + target + " not found");
        }
    }
}