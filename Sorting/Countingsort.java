import java.util.Arrays;
import java.util.Scanner;

public class CountingSort {
    
    // User-defined function to perform Counting Sort
    public static int[] countingSort(int[] arr, int max) {
        // Create a count array to store the frequency of each number
        int[] count = new int[max + 1]; // Array size is max+1 to handle the range of elements
        int[] sortedArr = new int[arr.length]; // Array to store sorted output

        // Step 1: Count the occurrence of each number in the input array
        for (int num : arr) {
            count[num]++;
        }

        // Step 2: Modify the count array such that each element at index i contains 
        // the sum of previous counts. It tells the correct positions of elements.
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Build the sorted array using the count array
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            sortedArr[count[num] - 1] = num;
            count[num]--;  // Decrease the count once placed in sorted array
        }

        return sortedArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input for array size and elements
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array (non-negative integers):");
        int max = 0;  // Variable to track the maximum value in the array

        // Step 2: Populate the array and determine the maximum value
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                max = arr[i]; // Update max to the largest value in the array
            }
        }

        // Step 3: Perform Counting Sort
        int[] sortedArray = countingSort(arr, max);

        // Output the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));

        scanner.close();
    }
}
