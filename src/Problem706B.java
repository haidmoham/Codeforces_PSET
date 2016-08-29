/**
 * Created by mohammad on 8/28/16.
 */
import java.util.*;

public class Problem706B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++)
            prices[i] = sc.nextInt();
        int q = sc.nextInt();
        int[] coins = new int[q];
        for (int i = 0; i < q; i++)
            coins[i] = sc.nextInt();
        Arrays.sort(prices);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++){
            sb.append(binarySearch(prices, coins[i], 0, prices.length));
            sb.append('\n');
        }
        System.out.println(sb.toString());
    }
    public static int binarySearch(int[] prices, int e, int begin, int end){
        int mid = 0, left = begin, right = end;
        for (int i = 0; i < 200; i++){
            mid = (left + right) >> 1;
            if (e >= prices[mid])
                left = mid;
            else
                right = mid;
        }
        if (e < prices[mid])
            mid--;
        return mid + 1;
    }
}
