package A; /**
 * Created by mohammad on 7/25/16.
 */
import java.util.*;

public class Problem405A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] in = new int[n];
        for (int i = 0; i < n; i++){
            in[i] = s.nextInt();
        }
        Arrays.sort(in);
        for (int i = 0; i < n; i++)
            System.out.print(in[i] + " ");
    }
}
