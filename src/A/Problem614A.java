package A; /**
 * Created by mohammad on 8/21/16.
 */
import java.util.*;

public class Problem614A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long l, r, k;
        l = in.nextLong();
        r = in.nextLong();
        k = in.nextLong();
        int i = 0;
        while (k <= r){
            System.out.println(k);
            k = (long) Math.pow(k, i);
            i++;
        }
    }
}
