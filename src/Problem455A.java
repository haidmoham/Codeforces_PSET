/**
 * Created by mohammad on 8/23/16.
 */
import java.util.*;

public class Problem455A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[10001];
        for (int i = 0; i < n; i++){
            int value = sc.nextInt();
            a[value] += value;
        }
        long f0 = 0, f1 = 0;
        for (int i = 1; i < 10001; i++)
            f1 = Math.max(f0 + a[i], f0 = f1);
        System.out.println(f1);
    }
}
