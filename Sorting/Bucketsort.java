import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InteractiveBucketSort {

    // Function to perform Bucket Sort
    public static void bucketSort(float[] arr) {
        int n = arr.length;
        if (n <= 0) {
            return;
        }

        // Step 1: Create n empty buckets
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Step 2: Distribute elements into different buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]); // Get bucket index
            buckets[bucketIndex].add(arr[i]);
        }

        // Step 3: Sort individual buckets
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]); // You can replace with a different sorting algorithm if needed
        }

        // Step 4: Concatenate all buckets into arr
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    // Main method for user interaction
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for number of elements
        System.out.print("Enter the number of elements to sort: ");
        int numElements = sc.nextInt();
        
        // Create an array to store user-defined elements
        float[] arr = new float[numElements];

        // User input for array elements
        System.out.println("Enter the elements (between 0 and 1):");
        for (int i = 0; i < numElements; i++) {
            arr[i] = sc.nextFloat(); // Accept floating-point numbers between 0 and 1
        }

        // Perform Bucket Sort
        bucketSort(arr);

        // Display sorted array
        System.out.println("Sorted array: ");
        for (float value : arr) {
            System.out.print(value + " ");
        }
    }
}
