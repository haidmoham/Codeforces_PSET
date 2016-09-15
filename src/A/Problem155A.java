package A; /**
 * Created by mohammad on 7/27/16.
 */
import java.util.*;

public class Problem155A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] in = new int[n];

        for (int i = 0; i < n; i++) {
            in[i] = s.nextInt();
        }
        int best = in[0];
        int worst = in[0];
        int count = 0;
        for (int i = 0; i < n; i++){
            if (in[i] > best){
                count++;
                best = in[i];
            }
            if (in[i] < worst){
                count++;
                worst = in[i];
            }
        }
        System.out.println(count);
    }
}