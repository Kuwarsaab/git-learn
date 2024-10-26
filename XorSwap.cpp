// This program demonstrates how to swap two integer values using the bitwise XOR operation, without needing a temporary third variable.
// It walks through the steps of swapping the values while printing each intermediate step, making it clear how the XOR operation works.
// This approach slightly reduces memory access operations compared to using a temporary variable, providing a small optimization in certain low-level or performance-critical scenarios.

#include <iostream> // For standard input/output stream (std::cin, std::cout)
#include <bitset> // For converting numbers to their binary representation

// Simple XOR swap function
void xorSwap(unsigned int &a, unsigned int &b) {
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
}

int main()
{
    unsigned int a, b;

    // Get user input for a and b
    std::cout << "Enter two values between 0-255." << std::endl << "Value a: ";
    std::cin >> a;
    std::cout << "Value b: ";
    std::cin >> b;

    // Print the original values in binary
    std::cout << "Original values: " << "a = " << std::bitset<8>(a) << ", b = " << std::bitset<8>(b) << std::endl;

    // Step 1: a = a ^ b
    a = a ^ b;
    std::cout << "After a = a ^ b: " << "a = " << std::bitset<8>(a) << ", b = " << std::bitset<8>(b) << std::endl;

    // Step 2: b = a ^ b (which is now (a ^ b) ^ b = a)
    b = a ^ b;
    std::cout << "After b = a ^ b: " << "a = " << std::bitset<8>(a) << ", b = " << std::bitset<8>(b) << std::endl;

    // Step 3: a = a ^ b (which is now (a ^ b) ^ a = b)
    a = a ^ b;
    std::cout << "After a = a ^ b: " << "a = " << std::bitset<8>(a) << ", b = " << std::bitset<8>(b) << std::endl << std::endl;

    // Print the swapped values
    std::cout << "Now a is: " << a << " (" << std::bitset<8>(a) << ")" << std::endl;
    std::cout << "And b is: " << b << " (" << std::bitset<8>(b) << ")" << std::endl;

    return 0;
}
