package C; /**
 * Created by mohammad on 9/1/16.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.*;

public class Problem580C {
    static boolean[] hasCat;
    static List<Integer>[] adj;
    static int m, n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        hasCat = new boolean[n];
        adj = new List[n];

        for (int i = 0; i < n; i++) {
            hasCat[i] = sc.nextInt() == 1;
            adj[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            int fr = sc.nextInt() - 1;
            int to = sc.nextInt() - 1;
            adj[fr].add(to);
            adj[to].add(fr);
        }
        System.out.println(dfs(0, -1, 0));
    }

    public static int dfs(int v, int parent, int cats) {
        if (cats == m && hasCat[v]) return 0;
        boolean isLeaf = parent != -1 && adj[v].size() == 1;
        if (isLeaf) return 1;
        int answer = 0;
        for (int child : adj[v]) if (child != parent)
            answer += dfs(child, v, hasCat[v] ? cats + 1 : 0);
        return answer;
    }
}

