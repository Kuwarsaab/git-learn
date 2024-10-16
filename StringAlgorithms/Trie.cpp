#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

const int letters = 26;

struct Node {
    vector<int> next_node;
    int is_a_leaf = 0;

    Node() {
        next_node.resize(letters, -1);
    }
};

struct Trie {
    vector<Node> trie_tree;

    Trie() {
        trie_tree.emplace_back();
    }

    void add_string(const string& a) {
        int root_here = 0;
        for (char c : a) {
            int index = c - 'a';
            if (trie_tree[root_here].next_node[index] == -1) {
                trie_tree[root_here].next_node[index] = trie_tree.size();
                trie_tree.emplace_back();
            }
            root_here = trie_tree[root_here].next_node[index];
        }
        trie_tree[root_here].is_a_leaf++;
    }

    bool search_string(const string& a) {
        int root_here = 0;
        for (char c : a) {
            int index = c - 'a';
            if (trie_tree[root_here].next_node[index] == -1) {
                return false;
            }
            root_here = trie_tree[root_here].next_node[index];
        }
        return trie_tree[root_here].is_a_leaf > 0;
    }
};

int main() {
    Trie t;

    // Adding words to the trie
    string word1 = "apple";
    string word2 = "app";
    string word3 = "banana";

    t.add_string(word1);
    t.add_string(word2);
    t.add_string(word3);

    // Searching for words
    cout << "Searching for 'apple': " << (t.search_string("apple") ? "Found" : "Not Found") << endl;
    cout << "Searching for 'app': " << (t.search_string("app") ? "Found" : "Not Found") << endl;
    cout << "Searching for 'banana': " << (t.search_string("banana") ? "Found" : "Not Found") << endl;
    cout << "Searching for 'orange': " << (t.search_string("orange") ? "Found" : "Not Found") << endl;

    return 0;
}
