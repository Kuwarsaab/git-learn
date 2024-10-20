#include <iostream>
#include <vector>
#include <unordered_set>
#include <algorithm>
using namespace std;

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        int n = nums.size();
        
        // Sort the array first to easily manage duplicates and use two-pointers
        sort(nums.begin(), nums.end());

        // Iterate over each element in the array
        for (int i = 0; i < n - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            unordered_set<int> seen;
            for (int j = i + 1; j < n; j++) {
                int complement = -(nums[i] + nums[j]);

                // Check if the complement has been seen before
                if (seen.count(complement)) {
                    result.push_back({nums[i], nums[j], complement});

                    // Skip duplicates for the second and third element
                    while (j + 1 < n && nums[j] == nums[j + 1]) j++;
                }
                seen.insert(nums[j]);
            }
        }

        return result;
    }
};

int main() {
    Solution solution;
    vector<int> arr = {-1, 0, 1, 2, -1, -4};

    vector<vector<int>> result = solution.threeSum(arr);

    // Output the results
    cout << "Triplets that sum to zero are: " << endl;
    for (const auto& triplet : result) {
        cout << "[";
        for (int i = 0; i < triplet.size(); i++) {
            cout << triplet[i];
            if (i < triplet.size() - 1) cout << ", ";
        }
        cout << "]" << endl;
    }

    return 0;
}
