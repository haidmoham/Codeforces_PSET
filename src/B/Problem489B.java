package B; /**
 * Created by mohammad on 8/23/16.
 */
import java.util.*;

public class Problem489B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = 0, ans = 0;
        while (i < n && j < m){
            if (a[i] - b[j] > 1) j++;
            else if (b[j] - a[i] > 1) i++;
            else {
                i++;
                j++;
                ans++;
            }
        }
        System.out.printf("%d", ans);
    }
}
