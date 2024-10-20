import java.util.Scanner;

public class QuickSort {

    // Method to perform Quick Sort on an array
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition method to find the pivot and arrange elements
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choosing the last element as pivot
        int i = low - 1; // Pointer for the smaller element

        // Rearranging the array based on the pivot
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++; // Increment index of smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to take user input and execute the Quick Sort
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting the number of elements from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Taking array elements from the user
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Printing the original array
        System.out.println("Original Array:");
        printArray(arr);

        // Performing Quick Sort
        quickSort(arr, 0, arr.length - 1);

        // Printing the sorted array
        System.out.println("Sorted Array:");
        printArray(arr);

        // Closing the scanner
        scanner.close();
    }
}
