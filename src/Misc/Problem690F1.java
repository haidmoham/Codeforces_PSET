package Misc; /**
 * Created by mohammad on 7/26/16.
 */
import java.util.*;
public class Problem690F1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] deg = new int[n];
        boolean[][] connected = new boolean[n][n];
        for (int i = 0; i < n - 1; i++){
            int a = s.nextInt() - 1, b = s.nextInt() - 1;
            connected[a][b] = true;
            connected[b][a] = true;
            deg[a]++;
            deg[b]++;
        }
        int lifeLine = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (connected[i][j]) lifeLine += deg[j] - 1;
            }
        }
        System.out.println(lifeLine/2);
    }
}
