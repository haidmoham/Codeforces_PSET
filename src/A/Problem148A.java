package A; /**
 * Created by Mohammad Haider (haidmoham) on 7/18/16.
 */
import java.util.*;

public class Problem148A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int k, l, m , n, d;
        k = s.nextInt();
        l = s.nextInt();
        m = s.nextInt();
        n = s.nextInt();
        d = s.nextInt();
        int count = 0;
        for (int i = 1; i <= d; i++){
            if (i%k == 0|| i%l == 0|| i%m == 0|| i%n == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
