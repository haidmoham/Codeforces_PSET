package A; /**
 * Created by Mohammad Haider (haidmoham) on 7/19/16.
 */
import java.util.*;

public class Problem136A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] ar = new int[n];
        for(int i = 1; i <= n; i++)
            ar[s.nextInt() - 1] = i;
        for (int i = 0; i < n; i++)
            System.out.print(ar[i] + " ");

    }
}

