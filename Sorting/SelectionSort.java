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
