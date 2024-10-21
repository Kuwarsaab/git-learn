#include <iostream>
#include <vector>
#include <string>
using namespace std;

int editDistance(const string& word1, const string& word2) {
    int m = word1.size(), n = word2.size();
    vector<vector<int>> dp(m + 1, n + 1);

    // Base cases: converting from or to an empty string
    for (int i = 0; i <= m; ++i) dp[i][0] = i;
    for (int j = 0; j <= n; ++j) dp[0][j] = j;

    // Fill the DP table
    for (int i = 1; i <= m; ++i) {
        for (int j = 1; j <= n; ++j) {
            if (word1[i - 1] == word2[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1];
            } else {
                dp[i][j] = 1 + min({dp[i - 1][j - 1], dp[i - 1][j], dp[i][j - 1]});
            }
        }
    }
    return dp[m][n];
}

int main() {
    string word1 = "horse", word2 = "ros";
    cout << "Minimum operations: " << editDistance(word1, word2) << endl;
    return 0;
}
