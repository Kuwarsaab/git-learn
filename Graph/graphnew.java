import java.util.*;

class Node {
    int vertex;
    int color;
    ArrayList<Node> adjNode;
    public Node(int v){
        this.vertex=v;
        this.color=-1;
        adjNode=new ArrayList<>();
    }
    public void addEdge(Node newNode){
        adjNode.add(newNode);
    }
}
class graph{
    int vertices;
    int adjmatrix[][];
    graph(int v){
        vertices=v;
        adjmatrix=new int[vertices][vertices];
    }
    public void addEdge(int source,int destination,int weight){
        adjmatrix[source][destination]=weight;
    }
    public void display(){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(adjmatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class graphnew {
    public static void bfsTraversal(Node root){
        Queue<Node> queue=new LinkedList<>();
        ArrayList<Node> visited=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node currNode=queue.remove();
            if(!visited.contains(currNode)){
                System.out.print(currNode.vertex+" ");
                for(Node newNode:currNode.adjNode){
                    queue.add(newNode);
                }
            }
        }
    }
    public static void dfsTraversal(Node root){
        Stack<Node> stack=new Stack<>();
        ArrayList<Node> Visited=new ArrayList<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node currNode=stack.pop();
            if(!Visited.contains(currNode)){
                Visited.add(currNode);
                System.out.print(currNode.vertex+" ");
                for(Node newNode:currNode.adjNode){
                    stack.push(newNode);
                }
            }
        }
    }
    public static boolean isBipartite(Node[] graph) {
        int numNodes = graph.length;
        for (int i = 0; i < numNodes; i++) {
            if (graph[i].color == -1 && !bfs(graph, i)) {
                return false;
            }
        }
        return true;
    }
    private static boolean bfs(Node[] graph, int startNode) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(graph[startNode]);
        graph[startNode].color = 0;

        while (!queue.isEmpty()) {
            Node currNode = queue.remove();
            int currentColor = currNode.color;

            for (Node neighbor : currNode.adjNode) {
                if (neighbor.color == -1) {
                    // Assign the opposite color to the neighbor
                    neighbor.color = 1 - currentColor;
                    queue.add(neighbor);
                } else if (neighbor.color == currentColor) {
                    return false; // If adjacent nodes have the same color, the graph is not bipartite
                }
            }
        }
        return true;
    }
    static class graphsort {
        int vertices;
        int[][] adjMatrix;

       public graphsort(int vertices) {
           this.vertices = vertices;
           adjMatrix = new int[vertices][vertices];
       }
       public void addEdge(int s, int d) {
           adjMatrix[s][d] = 1;
       }
       public void topologicalSort() {
           Stack<Integer> stack = new Stack<>();
           boolean[] visited = new boolean[vertices];

           for (int i = 0; i < vertices; i++) {
               if (!visited[i]) {
                   topologicalSortUtil(i, visited, stack);
               }
           }
           System.out.println("After doing the topoplogical sorting order:");
           while (!stack.isEmpty()) {
               System.out.print(stack.pop() + " ");
           }
       }
    void topologicalSortUtil(int v, boolean[] visited, Stack<Integer> stack) {
           visited[v] = true;

           for (int neighbor = 0; neighbor < vertices; neighbor++) {
               if (adjMatrix[v][neighbor] == 1 && !visited[neighbor]) {
                   topologicalSortUtil(neighbor, visited, stack);
               }
           }
           stack.push(v);
       }
    }
    public static void main(String[] args) {

        System.out.println("DFS traversal of a graph");
        System.out.println("BFS traversal of a graph");
        System.out.println("Matrix representation of undirected unweighted graph");
        System.out.println("Matrix representation of directed weighted graph");
        System.out.println("Matrix representation of directed unweighted graph");
        System.out.println("Matrix representation of directed weighted graph");
        System.out.println("Topological sort of this graph is :");
        Scanner sc = new Scanner(System.in);
        //bfs and dfs
     
        Node a = new Node(0);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(4);
        Node f = new Node(5);
        a.addEdge(b);
        a.addEdge(c);
        b.addEdge(d);
        b.addEdge(e);
        c.addEdge(f);
       //adjacency matrix 
       System.out.println("Enter the number of vertices");
       int vertices=sc.nextInt();

       graph undirectedUnweighted=new graph(vertices);
       graph undirectedWeighted=new graph(vertices);
       graph directedUnweighted=new graph(vertices);
       graph directedWeighted=new graph(vertices);

       System.out.println("Enter the number of edges");
       int edges=sc.nextInt();

        for (int i = 0; i < edges; i++) {
           System.out.println("Enter the source vertex");
           int source = sc.nextInt();
           System.out.println("Enter the destination vertex");
           int destination = sc.nextInt();
           System.out.println("Enter the weight");
           int weight = sc.nextInt(); // Only used for weighted graphs
           // Undirected Unweighted and for unweighted graph weight is 1
           undirectedUnweighted.addEdge(source, destination, 1);
           undirectedUnweighted.addEdge(destination, source, 1);
           // Undirected Weighted
           undirectedWeighted.addEdge(source, destination, weight);
           undirectedWeighted.addEdge(destination, source, weight);
           // Directed Unweighted
           directedUnweighted.addEdge(source, destination, 1);
           // Directed Weighted
           directedWeighted.addEdge(source, destination, weight);
       }
//topological sort
int numVertices = 6;
graphsort graphobj = new graphsort(numVertices);
// Example graph edges
graphobj.addEdge(5, 2);
graphobj.addEdge(5, 0);
graphobj.addEdge(4, 0);
graphobj.addEdge(4, 1);
graphobj.addEdge(2, 3);
graphobj.addEdge(3, 1);

//bipartite graph
int numNodes = 5;
Node[] newobj = new Node[numNodes];

for (int i = 0; i < numNodes; i++) {
    newobj[i] = new Node(i);
}
newobj[0].addEdge(newobj[1]);
newobj[0].addEdge(newobj[2]);
newobj[1].addEdge(newobj[3]);
newobj[2].addEdge(newobj[3]);
newobj[1].addEdge(newobj[4]);

boolean flag=false;
        while(flag==false){
        System.out.println("Enter your choice for running the different cases");
        int ch = sc.nextInt();
        switch (ch) {
            case 1: System.out.println("The DFS traversal is :");
                    dfsTraversal(a);
                    flag=false;
                   break;
            case 2:System.out.println("The BFS traversal is :");
                   bfsTraversal(a);
                   flag=false;
                   break;
           case 3:System.out.println("Matrix representation of Undirected unweighted graph ");
                   undirectedUnweighted.display();
                   flag=false;
                 break;
           case 4:System.out.println("Matrix representation of Undirected weighted graph");
                  undirectedWeighted.display();
                  flag=false;
                 break;
           case 5:System.out.println("Matrix representation of Directed Unweighted graph");
                  directedUnweighted.display();
                  flag=false;
                 break;   
           case 6:System.out.println("Matrix representation of Directed weighted graph");
                  directedWeighted.display();
                  flag=false;
                 break;   
             case 7: graphobj.topologicalSort();
                    flag=false;
                      break;     
             case 8:if(isBipartite(newobj))System.out.println("Graph is bipartitie...");
                    else System.out.println("Graph is not bipartite...");
                    flag=false;
                    break;     
             default:System.out.println("INvlaid choice");
                    flag=true;
                    break;         
        }
      }
    }
}