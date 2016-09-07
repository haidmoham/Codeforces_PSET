/**
 * Created by mo on 9/6/16.
 */
import java.util.*;

public class Problem520B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayDeque<Integer> bfs = new ArrayDeque<>();
        bfs.add(n);
        int[] best = new int[(int) 2e15];
        best[n] = 0;
        int steps = 0;

        while (bfs.size() > 0){
            n = bfs.pop();
            steps = best[n];
            if (n == m){
                System.out.println(steps);
                break;
            }

            if (n < 10000 && best[2*n] > steps + 1){
                best[2*n] = steps + 1;
                bfs.add(2*n);
            }
            if (n > 0 && best[n-1] > steps + 1){
                best[n-1] = steps + 1;
                bfs.add(n-1);
            }
        }
    }
}