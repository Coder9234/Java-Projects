import java.util.*;

public class topologicalSort{
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void topSort(ArrayList<Edge> graph[]){
        boolean visited[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < graph.length; i++){
            if (!visited[i]){
                topSortUtil(graph, i, visited, s);
            }
        }
        while (!s.isEmpty()){
            System.out.println(s.pop() + " ");
        }
    }

    public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean visited[], Stack s){
        visited[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]){
                topSortUtil(graph, e.dest, visited, s);
            }
        }
        s.push(curr);
    }

    public static void main(String args[]){
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        topSort(graph);
    }
}