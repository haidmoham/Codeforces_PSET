/**
 * Created by mohammad on 7/28/16.
 */
import java.math.BigInteger;
import java.util.*;

public class Problem519B {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ar1 = 0;
        int ar2 = 0;
        int ar3 = 0;
        for (int i = 0; i < n; i++)
            ar1 += s.nextInt();
        for (int i = 0; i < n - 1; i++)
            ar2 += s.nextInt();
        for (int i = 0; i < n - 2; i++)
            ar3 += s.nextInt();
        System.out.println(ar1 - ar2);
        System.out.println(ar2 - ar3);
    }
}
