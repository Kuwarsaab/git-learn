import java.util.*;

public class graph{
    static class Edge{
        int source;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.source = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void main(String[] args){

        /*
                    (5)
         *      0 --------- 1
         *                 /  \
         *            (1) /    \ (3)
         *               /      \
         *              2 ------ 3
         *              |   (1)
         *           (2)|
         *              |
         *              4
         */
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        
        for(int i=0;i<V;i++){
            graph[i] = new ArrayList<>();
        }

        // 0- Vertex
        graph[0].add(new Edge(0,1,5));

        // 1- Vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        // 2- Vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));

        // 3- Vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        // 4- Vertex
        graph[4].add(new Edge(4,2,2));

        // For printing a Vertex's Neighbours
        int ver = 2;
        for(int i=0;i<graph[ver].size();i++){
            Edge e = graph[ver].get(i);
            System.out.print(e.dest+" ");
        }
    }
}