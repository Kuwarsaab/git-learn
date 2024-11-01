#include <iostream>
#include <list>
#include <vector>
using namespace std;

class HashTable {
private:
    vector<list<int>> table;
    int size;

    int hashFunction(int key) {
        return key % size;
    }

public:
    HashTable(int s) : size(s) {
        table.resize(size);
    }

    void insert(int key) {
        int index = hashFunction(key);
        table[index].push_back(key);
    }

    void remove(int key) {
        int index = hashFunction(key);
        table[index].remove(key);
    }

    bool search(int key) {
        int index = hashFunction(key);
        for (auto &element : table[index]) {
            if (element == key) return true;
        }
        return false;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            cout << i << ": ";
            for (auto &element : table[i]) {
                cout << element << " -> ";
            }
            cout << "NULL" << endl;
        }
    }
};

int main() {
    HashTable ht(7);
    ht.insert(10);
    ht.insert(20);
    ht.insert(15);
    ht.insert(7);

    cout << "Hash Table:" << endl;
    ht.display();

    cout << "Search 15: " << (ht.search(15) ? "Found" : "Not Found") << endl;
    ht.remove(15);
    cout << "After removing 15:" << endl;
    ht.display();

    return 0;
}