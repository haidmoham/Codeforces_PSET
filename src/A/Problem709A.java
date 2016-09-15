package A; /**
 * Created by mohammad on 8/24/16.
 */
import java.util.*;

public class Problem709A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), b = sc.nextInt(), d = sc.nextInt();
        int[] in = new int[n];
        long waste = 0;
        int count = 0;
        for (int i = 0; i < n; i++)
            in[i] = sc.nextInt();
        for (int i = 0; i < n; i++){
            if (waste < d){
                waste += in[i];
            }
            else {
                count++;
                waste = 0;
            }
        }
        if (waste > d)
            count++;
        System.out.println(count);
    }
}
