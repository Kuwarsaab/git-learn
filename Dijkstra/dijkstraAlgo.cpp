/*
This program simulates Dijkstra's algorithm for finding shortest paths 
in directed weighted graphs, allowing users to dynamically add edges, 
detect cycles, and calculate paths interactively.
*/

#include <iostream>
#include <vector>
#include <queue>
#include <limits>
#include <unordered_set>

using namespace std;

class Graph {
public:
    Graph(int nodes);
    void addEdge(int u, int v, int weight);
    bool detectCycle();
    void dijkstra(int source, vector<int>& distances, vector<int>& parent);
    void printShortestPath(int source, int destination, const vector<int>& parent);
    
private:
    int numNodes;
    vector<vector<pair<int, int>>> adjList; // Adjacency list representation
    bool dfs(int v, unordered_set<int>& visited, unordered_set<int>& recStack);
};

// Graph constructor
Graph::Graph(int nodes) : numNodes(nodes) {
    adjList.resize(numNodes + 1); // 1-based indexing
}

// Add an edge to the graph
void Graph::addEdge(int u, int v, int weight) {
    adjList[u].emplace_back(v, weight); // Directed graph
}

// Depth-first search for cycle detection
bool Graph::dfs(int v, unordered_set<int>& visited, unordered_set<int>& recStack) {
    visited.insert(v);
    recStack.insert(v);
    
    for (auto& neighbor : adjList[v]) {
        int nextNode = neighbor.first;
        if (recStack.find(nextNode) != recStack.end()) {
            return true; // Cycle found
        }
        if (visited.find(nextNode) == visited.end()) {
            if (dfs(nextNode, visited, recStack)) {
                return true;
            }
        }
    }
    
    recStack.erase(v);
    return false;
}

// Check for cycles in the graph
bool Graph::detectCycle() {
    unordered_set<int> visited;
    unordered_set<int> recStack;
    
    for (int i = 1; i <= numNodes; ++i) {
        if (visited.find(i) == visited.end()) {
            if (dfs(i, visited, recStack)) {
                return true;
            }
        }
    }
    
    return false;
}

// Dijkstra's algorithm
void Graph::dijkstra(int source, vector<int>& distances, vector<int>& parent) {
    distances.assign(numNodes + 1, numeric_limits<int>::max());
    parent.assign(numNodes + 1, -1);
    distances[source] = 0;

    priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
    pq.push({0, source});

    while (!pq.empty()) {
        int currentNode = pq.top().second;
        int currentDistance = pq.top().first;
        pq.pop();

        if (currentDistance > distances[currentNode]) continue;

        for (const auto& neighbor : adjList[currentNode]) {
            int nextNode = neighbor.first;
            int weight = neighbor.second;
            if (distances[currentNode] + weight < distances[nextNode]) {
                distances[nextNode] = distances[currentNode] + weight;
                parent[nextNode] = currentNode;
                pq.push({distances[nextNode], nextNode});
            }
        }
    }
}

// Print the shortest path from source to destination
void Graph::printShortestPath(int source, int destination, const vector<int>& parent) {
    if (parent[destination] == -1) {
        cout << "No path from node " << source << " to node " << destination << endl;
        return;
    }

    vector<int> path;
    for (int v = destination; v != -1; v = parent[v]) {
        path.push_back(v);
    }

    cout << "Shortest path from node " << source << " to node " << destination << ": ";
    for (auto it = path.rbegin(); it != path.rend(); ++it) {
        cout << *it << (it + 1 != path.rend() ? " -> " : "");
    }
    cout << endl;
}

// Main function
int main() {
    int numNodes;
    cout << "Enter the number of nodes in the graph: ";
    cin >> numNodes;

    Graph graph(numNodes);
    
    int choice;
    do {
        cout << "\nMenu:\n";
        cout << "1. Add edge\n";
        cout << "2. Detect cycle\n";
        cout << "3. Calculate shortest distance\n";
        cout << "4. Print shortest path\n";
        cout << "5. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                int u, v, weight;
                cout << "Enter edge (u v weight): ";
                cin >> u >> v >> weight;
                graph.addEdge(u, v, weight);
                break;
            }
            case 2: {
                if (graph.detectCycle()) {
                    cout << "Cycle detected in the graph.\n";
                } else {
                    cout << "No cycle detected in the graph.\n";
                }
                break;
            }
            case 3: {
                int source, destination;
                cout << "Enter source and destination nodes: ";
                cin >> source >> destination;
                vector<int> distances;
                vector<int> parent;
                graph.dijkstra(source, distances, parent);
                cout << "Shortest distance from node " << source << " to node " << destination << ": "
                     << (distances[destination] == numeric_limits<int>::max() ? -1 : distances[destination]) << endl;
                break;
            }
            case 4: {
                int source, destination;
                cout << "Enter source and destination nodes: ";
                cin >> source >> destination;
                vector<int> parent;
                vector<int> distances;
                graph.dijkstra(source, distances, parent);
                graph.printShortestPath(source, destination, parent);
                break;
            }
            case 5:
                cout << "Exiting...\n";
                break;
            default:
                cout << "Invalid choice. Please try again.\n";
        }
    } while (choice != 5);

    return 0;
}
