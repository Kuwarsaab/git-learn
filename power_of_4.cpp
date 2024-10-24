// Given a positive number, check if it is a power of four or not.
#include <iostream>

using namespace std;

// Returns true if `n` is a power of four
constexpr bool isPowerOf4(unsigned n)
{
    // Powers of 4 can only be > 1
    if (n == 0)
        return false;

    // An integer that is the power of 4 has only one bit set. We check this by AND-ing the value with itself minus one.
    if ((n & (n - 1)) != 0)
        return false;

    // Ensure the only set bit is in an odd position, for powers of 4 have their only set bit in positions 0, 2, 4, 6, ... etc
    if ((n & 0b10101010101010101010101010101010) != 0)
        return false;

    // Both conditions have been met, so `n` must be a power of 4!
    return true;
}

int main()
{
    unsigned n = 256;

    if (isPowerOf4(n))
    {
        cout << n << " is a power of 4";
    }
    else
    {
        cout << n << " is not a power of 4";
    }

    return 0;
}
