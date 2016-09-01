/**
 * Created by mohammad on 8/24/16.
 */
import com.sun.javafx.geom.Edge;

import java.util.*;

public class Problem653D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt();
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < m; i++)
            graph.add(new ArrayList<>());

    }
    static class Edge implements Comparable<Edge>{
        public int length;
        public int x;
        public int id;

        public Edge(int X, int L, int ID){
            x = X;
            length = L;
            id = ID;
        }
        public int compareTo(Edge other){
            int temp = length - other.length;
            if (temp != 0)
                return temp;
            return id - other.id;
        }
    }
}
