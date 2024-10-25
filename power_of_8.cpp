// Given a positive number, check if it is a power of eight or not.
#include <iostream>

using namespace std;

// Returns true if `n` is a power of eight
constexpr bool isPowerOf8(unsigned long long n)
{
    // Powers of 8 can only be > 1
    if (n == 0)
        return false;

    // An integer that is the power of 8 has only one bit set. We check this by AND-ing the value with itself minus one.
    if ((n & (n - 1)) != 0)
        return false;

    // Powers of 8 have their only set bit in positions 0, 3, 6, 9, 12, ... etc (every 3rd bit, because 2^3 = 8, which is the power we're looking for!)
    if ((n & 0b1001'0010'0100'1001'0010'0100'1001'0010'0100'1001'0010'0100'1001'0010'0100'1001ULL) == 0)
        return false;

    // Both conditions have been met, so `n` must be a power of 8!
    return true;
}

int main()
{
    auto input = 144'115'188'075'855'872ULL; // A very large power of 8

    if (isPowerOf8(input))
    {
        cout << input << " is a power of 8";
    }
    else
    {
        cout << input << " is not a power of 8";
    }

    return 0;
}
