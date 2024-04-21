import java.util.*;

public class detectCyclebfs {
    static class Edge{
        int first;
        int second;

        public Edge(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(9, 5));
        graph[0].add(new Edge(9, 1));

        graph[1].add(new Edge(5, 9));
        graph[1].add(new Edge(5, 1));
        graph[1].add(new Edge(5, 2));

        graph[2].add(new Edge(2, 5));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(4, 2));
    }

    public static boolean isCycle(ArrayList<Edge> graph[], int s, boolean vis[], int par[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(new Edge(s, -1));
        vis[s] = true;
        while (!q.isEmpty()){
            int node = q.peek().first;
            int par = q.peek().second;
        }
    }
    public static void main(String args[]){
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
    }
}
