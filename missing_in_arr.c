// Find the missing number in an array.

#include <stdio.h>

// Find the missing number in a given array
int getMissingNumber(int arr[], int n)
{
    // the actual size is `n+1` since a number is missing from the array
    int m = n + 1;

    // get a sum of integers between 1 and `n+1`
    int total = m * (m + 1) / 2;

    // get an actual sum of integers in the array
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += arr[i];
    }

    // the missing number is the difference between the expected sum
    // and the actual sum
    return total - sum;
}

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 7, 8, 9, 10};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("The missing number is %d", getMissingNumber(arr, n));

    return 0;
}