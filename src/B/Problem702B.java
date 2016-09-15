package B; /**
 * Created by mohammad on 8/26/16.
 */
import java.util.*;
public class Problem702B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] in = new long[n];
        long count = 0;
        for (int i = 0; i < n; i++)
            in[i] = sc.nextLong();
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (((in[i] + in[j]) & (in[i] + in[j] - 1)) == 0)
                    count++;
            }
        }
        count /= 3;

        System.out.println(count);
    }
}
