package A; /**
 * Created by mohammad on 8/23/16.
 */
import java.util.*;

public class Problem702A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] in = new int[n];
        int max = 1;
        int sum = 1;
        for (int i = 0; i < n; i++)
            in[i] = sc.nextInt();
        for (int i = 1; i < n; i++){
            if (in[i] > in[i-1]){
                max++;
                if (max > sum) sum = max;
            }
            else
                max = 1;
        }
        System.out.println(sum);
    }
}
