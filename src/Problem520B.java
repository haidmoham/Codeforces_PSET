/**
 * Created by mo on 9/6/16.
 */
import java.util.*;

public class Problem520B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int iterate = 1000;
        for (int i = 0; i < iterate; i++)
            graph.add(new ArrayList<>());

        for (int i = n; i < iterate; i++){
            int root = n;

            int u = n - 1;
            int v = n * 2;
            graph.get(root).add(u);
            graph.get(u).add(root);

            graph.get(root).add(v);
            graph.get(v).add(root);
        }
        System.out.println(bfs(graph, n, m));
    }

    static int bfs(ArrayList<ArrayList<Integer>> graph, int start, int end){
        int[] dist = new int[graph.size()];

        Queue<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(start);
        visited.add(start);
        dist[start] = 0;

        while(!queue.isEmpty()){
            int current = queue.poll();
            int d = dist[current];
            if(current == end) return d;

            for (int adj : graph.get(current)){
                if (!visited.contains(adj)){
                    visited.add(adj);
                    queue.offer(adj);
                    dist[adj] = d+1;
                }
            }
        }
        return -1;
    }
}