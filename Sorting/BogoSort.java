import java.util.Arrays;
import java.util.Random;

public class BogoSort {

    // Method to check if the array is sorted
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // Method to shuffle the array randomly
    public static void shuffle(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndex = random.nextInt(array.length);
            // Swap elements
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }

    // BogoSort algorithm
    public static void bogoSort(int[] array) {
        while (!isSorted(array)) {
            shuffle(array);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 2, 4};

        System.out.println("Unsorted array: " + Arrays.toString(array));
        bogoSort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
