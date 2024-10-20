#include <iostream>
#include <vector>
#include <string>

using namespace std;

vector<int> prefix_function(const string& s) {
    int n = s.length();
    vector<int> pi(n, 0);
    for (int i = 1; i < n; ++i) {
        int j = pi[i - 1];
        while (j > 0 && s[i] != s[j])
            j = pi[j - 1];
        if (s[i] == s[j])
            ++j;
        pi[i] = j;
    }
    return pi;
}

int main() {
    string s;
    cout << "Enter a string: ";
    cin >> s;

    vector<int> pi = prefix_function(s);

    cout << "Prefix function values: ";
    for (int value : pi) {
        cout << value << " ";
    }
    cout << endl;

    return 0;
}
