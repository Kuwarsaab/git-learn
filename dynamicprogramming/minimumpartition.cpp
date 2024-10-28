#include <iostream>
#include <vector>
#include <numeric>
#include <cmath>
using namespace std;

int minPartition(vector<int>& nums) {
    int sum = accumulate(nums.begin(), nums.end(), 0);
    int n = nums.size();
    vector<vector<bool>> dp(n + 1, vector<bool>(sum / 2 + 1, false));

    for (int i = 0; i <= n; i++) dp[i][0] = true;

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= sum / 2; j++) {
            if (nums[i - 1] <= j)
                dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i - 1]];
            else
                dp[i][j] = dp[i - 1][j];
        }
    }

    int minDiff = sum;
    for (int j = sum / 2; j >= 0; j--) {
        if (dp[n][j]) {
            minDiff = sum - 2 * j;
            break;
        }
    }
    return minDiff;
}

int main() {
    vector<int> nums = {1, 6, 11, 5};
    cout << "Minimum Partition Difference: " << minPartition(nums) << endl;
    return 0;
}
