/**
 * Created by mohammad on 8/9/16.
 */
import java.util.*;

public class Problem500A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n, t, x = 1;
        n = in.nextInt();
        t = in.nextInt();
        int[] a = new int[n];
        for (int i = 1; i < n; i++) a[i] = in.nextInt();
        do x += a[x]; while (x < t);
        System.out.print(x == t ? "YES" : "NO");
    }
}
