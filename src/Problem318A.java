/**
 * Created by mohammad on 7/24/16.
 */
import java.util.*;

public class Problem318A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long k = s.nextLong();

        n++;
        n /= 2;
        if (k <= n)
            System.out.println(2*k-1);
        else
            System.out.println(2*(k-n));
    }
}
