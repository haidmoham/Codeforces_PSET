package B; /**
 * Created by mohammad on 8/23/16.
 */
import java.util.*;

public class Problem339B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), m = sc.nextLong();
        long a = 0;
        int p = 1;
        for (int i = 0; i < m; i++){
            int h = sc.nextInt();
            if (h >= p) a += h - p;
            else a += n - p + h;
            p = h;
        }
        System.out.println(a);
    }
}
