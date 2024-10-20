// Given a positive number, check if it is a power of 8 or not.

#include <iostream>
#include <cmath>
using namespace std;

// Returns true if `n` is a power of 8
bool checkPowerOf8(unsigned n)
{
    // find `log8(n)`
    double i = log(n) / log(8);

    // return true if `log8(n)` is an integer
    return i - trunc(i) < 0.000001;
}

int main()
{
    unsigned n = 512 * 64;

    if (checkPowerOf8(n))
    {
        cout << n << " is a power of 8";
    }
    else
    {
        cout << n << " is not a power of 8";
    }

    return 0;
}
