package array;

import java.lang.*;
        import static java.util.Collections.min;

public class MinMax {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 2, 8, 1, 6, 3, 7, 4};

        // Find the minimum and maximum
        int min = min(numbers);
        int max = max(numbers);

        // Display the results
        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);
    }

    // Function to find the maximum value in an array
    static int max(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


    // Function to find the maximum value in an array
    static int min(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}