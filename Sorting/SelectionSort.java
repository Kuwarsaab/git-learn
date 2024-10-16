class SelectionSort { 
    void sort(int arr[]) 
    { 
        int n = arr.length; 
  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n - 1; i++) { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i + 1; j < n; j++) { 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; } 
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    } 
  
    // Prints the array 
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // main function 
    public static void main(String args[]) 
    { 
        SelectionSort ob = new SelectionSort(); 
        int arr[] = { 64, 25, 12, 22, 11 }; 
  
        ob.sort(arr); 
        System.out.println("Sorted array"); 
        ob.printArray(arr); 
    } 
}

import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,1};
        Selection(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void Selection(int[] arr) {
        int max,index;
        for (int i = 0; i < arr.length; i++) {
            index = 0;
            max=arr[0];
            for (int j = 0; j < arr.length-i; j++) {
                if (max<arr[j]){
                    max = arr[j];
                    index=j;
                }
            }
            arr[index] = arr[arr.length-i-1];
            arr[arr.length-i-1] = max;
        }
    }
}
