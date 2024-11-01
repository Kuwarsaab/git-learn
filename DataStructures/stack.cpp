#include <iostream>
#include <vector>
using namespace std;

class Stack {
private:
    vector<int> stack;

public:
    void push(int value) {
        stack.push_back(value);
    }

    void pop() {
        if (stack.empty()) {
            cout << "Stack is empty.\n";
        } else {
            stack.pop_back();
        }
    }

    int top() {
        if (stack.empty()) {
            cout << "Stack is empty.\n";
            return -1;
        } else {
            return stack.back();
        }
    }

    bool isEmpty() {
        return stack.empty();
    }
};

int main() {
    Stack s;
    s.push(10);
    s.push(20);
    cout << "Top element: " << s.top() << endl;
    s.pop();
    cout << "Top element after pop: " << s.top() << endl;
    cout << "Is stack empty? " << (s.isEmpty() ? "Yes" : "No") << endl;
    return 0;
}
