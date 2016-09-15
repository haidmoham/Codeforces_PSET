package A; /**
 * Created by Mohammad Haider (haidmoham) on 7/20/16.
 */
import java.util.*;

public class Problem621A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long minOdd = Integer.MAX_VALUE;
        long[] num = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++){
            num[i] = s.nextLong();
        }
        for (int i = num.length-1; i >= 0; i--){
            if (num[i]%2 == 1 && num[i] < minOdd)
                minOdd = num[i];
            sum += num[i];
        }
        if (sum%2 == 1)
            sum -= minOdd;
        System.out.println(sum);
    }
}