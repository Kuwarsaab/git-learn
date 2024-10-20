#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class ThreeSum {
public:
    // Function to find all unique triplets that sum up to 0
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;  // To store the result triplets
        
        // If less than 3 elements, no triplets can be formed
        if (nums.size() < 3) return result;
        
        // Sort the array to apply two-pointer technique and handle duplicates
        sort(nums.begin(), nums.end());
        
        // Iterate over the array
        for (int i = 0; i < nums.size() - 2; i++) {
            // Skip duplicates for the first element of the triplet
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.size() - 1;
            
            // Apply two-pointer approach to find the other two numbers
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a valid triplet
                    result.push_back({nums[i], nums[left], nums[right]});
                    
                    // Skip duplicates for the second number
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for the third number
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    // Move pointers after processing a valid triplet
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Increase the left pointer if sum is less than 0
                    left++;
                } else {
                    // Decrease the right pointer if sum is greater than 0
                    right--;
                }
            }
        }
        return result;
    }
};

int main() {
    // Input array from the user
    int n;
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    vector<int> nums(n);
    cout << "Enter the elements of the array:\n";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    // Create an instance of ThreeSum and call the function
    ThreeSum solution;
    vector<vector<int>> triplets = solution.threeSum(nums);

    // Print the result
    cout << "Unique triplets that sum to 0:\n";
    for (const auto& triplet : triplets) {
        for (int num : triplet) {
            cout << num << " ";
        }
        cout << endl;
    }

    return 0;
}
