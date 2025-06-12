package com.mouni;

public class BubbleSort {
    public static void main(String[] args) {
        int[] candies = {5, 3, 8, 4, 2};

        // Bubble Sort algorithm
        for (int i = 0; i < candies.length - 1; i++) {
            for (int j = 0; j < candies.length - 1 - i; j++) {
                if (candies[j] > candies[j + 1]) {
                    // Swap candies[j] and candies[j+1]
                    int temp = candies[j];
                    candies[j] = candies[j + 1];
                    candies[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int candy : candies) {
            System.out.print(candy + " ");
        }
    }
}
