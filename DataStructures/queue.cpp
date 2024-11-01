#include <iostream>
#include <queue>
using namespace std;

class Queue {
private:
    queue<int> q;

public:
    void enqueue(int value) {
        q.push(value);
    }

    void dequeue() {
        if (q.empty()) {
            cout << "Queue is empty.\n";
        } else {
            q.pop();
        }
    }

    int front() {
        if (q.empty()) {
            cout << "Queue is empty.\n";
            return -1;
        } else {
            return q.front();
        }
    }

    bool isEmpty() {
        return q.empty();
    }
};

int main() {
    Queue q;
    q.enqueue(10);
    q.enqueue(20);
    cout << "Front element: " << q.front() << endl;
    q.dequeue();
    cout << "Front element after dequeue: " << q.front() << endl;
    cout << "Is queue empty? " << (q.isEmpty() ? "Yes" : "No") << endl;
    return 0;
}
