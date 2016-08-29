/**
 * Created by mohammad on 8/27/16.
 */
import java.util.*;

public class Problem474B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] worms = new int[n];
        worms[0] = sc.nextInt();
        for (int i = 1; i < n; i++)
            worms[i] = worms[i-1] + sc.nextInt();
        int m = sc.nextInt();
        int[] juicy = new int[m];
        for (int i = 0; i < m; i++)
            juicy[i] = sc.nextInt();
        sc.close();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m ;i++) {
            sb.append(binarySearch(worms, juicy[i], 0, n-1));
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }

    public static int binarySearch(int[] worms, int e, int begin, int end){
        int mid = 0, left = begin, right = end;
        for (int i = 0; i < 200; i++){
            mid = (left + right) >> 1;
            if (e > worms[mid])
                left = mid;
            else
                right = mid;
        }
        if (e > worms[mid])
            mid++;
        return mid + 1;
    }
}
