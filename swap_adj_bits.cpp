#include <iostream>
using namespace std;

// Function to swap adjacent bits of a given number
int swapAdjacentBits(int n)
{
    return (((n & 0xAAAAAAAA) >> 1) | ((n & 0x55555555) << 1));
}

int main()
{
    int n = 5;

    cout << "Original number: " << n << endl;
    n = swapAdjacentBits(n);
    cout << "After swapping adjacent bits: " << n << endl;

    return 0;
}
