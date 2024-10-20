/*
Insertion Sort
Time Complexity:
 - Worst-case: O(n^2)
 - Best-case: O(n) (nearly sorted array)
 - Average-case: O(n^2)

Space Complexity:
 - O(1) (in-place sorting)

Best for:
 - Small datasets
 - Nearly sorted arrays
*/


public class Solution 
{
    public void insertionSort(int[] arr) 
  {
        int n = arr.length;
        for(int i=1;i<n;i++) 
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key) 
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) 
    {
        Solution solution = new Solution();
        int[] arr = {64,34,25,12,22,11,90};
        solution.insertionSort(arr);
        for (int i:arr)
            System.out.print(i + " ");
    }
}
