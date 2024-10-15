/*
/*Bubble Sort
Time Complexity:
 - O(n^2)

Space Complexity: 
  - O(1) (in-place sorting)
Best for:
 - Small datasets.
 - Nearly sorted datasets.
*/

public class Solution{
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++) 
        {
            boolean swapped = false; // To check if any swapping happened in this pass
            for(int j=0;j<n-i-1;j++) 
            {
                if (arr[j]>arr[j+1]) 
                {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {5,1,4,2,8};
        bubbleSort(arr);
        for (int num : arr) 
            System.out.print(num + " ");
    }
}
