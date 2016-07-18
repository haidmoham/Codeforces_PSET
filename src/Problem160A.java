/**
 * Created by mohammad on 7/16/16.
 */
import java.util.*;

public class Problem160A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] coins = new int[n];
        int sum1 = 0;
        for(int i = 0;i < n;i++)
        {
            coins[i] = s.nextInt();
            sum1 += coins[i];
        }
        Arrays.sort(coins);
        int sum2 = 0;
        int count = 0;
        for(int i = n-1;i >= 0;i--)
        {
            sum2+=coins[i];
            count++;
            if(sum2>(sum1-sum2))
            {
                System.out.println(count);
                return ;
            }
        }
    }
}

