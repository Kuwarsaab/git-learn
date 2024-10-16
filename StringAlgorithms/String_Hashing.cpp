#include <iostream>
#include <vector>
#include <string>

using namespace std;
using ll = long long;

ll mod_mul(ll a, ll b, ll mod) {
    return (a * b) % mod;
}

ll mod_sub(ll a, ll b, ll mod) {
    return (a - b + mod) % mod;
}

// Function to find modular inverse of a under modulo p using Fermat's Little Theorem
ll mminvprime(ll a, ll p) {
    ll result = 1, power = p - 2;
    while (power) {
        if (power % 2) result = mod_mul(result, a, p);
        a = mod_mul(a, a, p);
        power /= 2;
    }
    return result;
}

struct Hashing {
    string s;
    int n;
    int primes;
    vector<ll> hashPrimes = {1000000009, 100000007};
    const ll base = 31;
    vector<vector<ll>> hashValues;
    vector<vector<ll>> powersOfBase;
    vector<vector<ll>> inversePowersOfBase;

    Hashing(const string& a) {
        primes = hashPrimes.size();
        s = a;
        n = s.length();
        
        hashValues.resize(primes, vector<ll>(n));
        powersOfBase.resize(primes, vector<ll>(n + 1));
        inversePowersOfBase.resize(primes, vector<ll>(n + 1));

        // Calculate powers of the base and their modular inverses
        for (int i = 0; i < primes; i++) {
            powersOfBase[i][0] = 1;
            for (int j = 1; j <= n; j++) {
                powersOfBase[i][j] = mod_mul(base, powersOfBase[i][j - 1], hashPrimes[i]);
            }
            inversePowersOfBase[i][n] = mminvprime(powersOfBase[i][n], hashPrimes[i]);
            for (int j = n - 1; j >= 0; j--) {
                inversePowersOfBase[i][j] = mod_mul(inversePowersOfBase[i][j + 1], base, hashPrimes[i]);
            } 
        }

        // Calculate hash values
        for (int i = 0; i < primes; i++) {
            for (int j = 0; j < n; j++) {
                hashValues[i][j] = ((s[j] - 'a' + 1LL) * powersOfBase[i][j]) % hashPrimes[i];
                hashValues[i][j] = (hashValues[i][j] + (j > 0 ? hashValues[i][j - 1] : 0LL)) % hashPrimes[i];
            }
        }
    }

    vector<ll> substringHash(int l, int r) {
        vector<ll> hash(primes);
        for (int i = 0; i < primes; i++) {
            ll val1 = hashValues[i][r];
            ll val2 = l > 0 ? hashValues[i][l - 1] : 0LL;
            hash[i] = mod_mul(mod_sub(val1, val2, hashPrimes[i]), inversePowersOfBase[i][l], hashPrimes[i]);
        }
        return hash;
    }
};

int main() {
    string s;
    cout << "Enter a string: ";
    cin >> s;

    Hashing hashing(s);

    int l, r;
    cout << "Enter substring range (l, r): ";
    cin >> l >> r;

    vector<ll> hashValues = hashing.substringHash(l, r);

    cout << "Hash values for the substring: ";
    for (ll val : hashValues) {
        cout << val << " ";
    }
    cout << endl;

    return 0;
}
