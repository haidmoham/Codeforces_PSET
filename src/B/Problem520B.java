package B; /**
 * Created by mo on 9/6/16.
 */
import java.util.*;

public class Problem520B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayDeque<Integer> bfs = new ArrayDeque<>();
        bfs.add(n);
        ArrayList<Integer> best = new ArrayList<>();
        for (int i = 0; i < 20001; i++){
            best.add((int) 10e7);
        }
        int steps = 0;


        best.set(n, steps);
        while (bfs.size() > 0){
            n = bfs.pop();
            steps = best.get(n);
            if (n == m){
                System.out.println(steps);
                break;
            }

            if (n < 10000 && best.get(2*n) > steps + 1){
                best.set(2*n, steps + 1);
                bfs.add(2*n);
            }
            if (n > 0 && best.get(n-1) > steps + 1){
                best.set(n-1, steps + 1);
                bfs.add(n-1);
            }
        }
    }
}