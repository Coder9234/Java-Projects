import java.util.*;

public class isBipartite {
    static class Edge {
        int src;
        int dest;

        public Edge (int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }

    public static boolean isbipartite(ArrayList<Edge> graph[]){
        int color[] = new int[graph.length];
        for (int i = 0; i < color.length; i++){
            color[i] = -1; // no colour
        }
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < graph.length; i++){
            if (color[i] == -1){ // BFS
                q.add(i);
                color[i] = 0; // blue
                while (!q.isEmpty()){
                    int curr = q.remove();
                    for (int j = 0; i < graph[curr].size(); j++){
                        Edge e = graph[curr].get(j);
                        if (color[e.dest] == -1){
                            int nextColor = color[curr] == 0 ? 1 : 0;
                            color[e.dest] = nextColor;
                            q.add(e.dest);
                        }
                        else if (color[e.dest] == color[curr]){
                            return false; // NOT bipartite
                        }
                    }
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        // if graph doesn't have cycles then it is a bipartite graph
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(isbipartite(graph));
    }
}
