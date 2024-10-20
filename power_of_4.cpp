//Given a positive number, check if it is a power of four or not .
#include <iostream>
#include <cmath>
using namespace std;

// Returns true if `n` is a power of four
bool checkPowerOf4(unsigned n)
{
    // find `log4(n)`
    double i = log(n) / log(4);

    // return true if `log4(n)` is an integer
    return i == trunc(i);
}

int main()
{
    unsigned n = 256;

    if (checkPowerOf4(n))
    {
        cout << n << " is a power of 4";
    }
    else
    {
        cout << n << " is not a power of 4";
    }

    return 0;
}
