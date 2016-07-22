/**
 * Created by Mohammad Haider (haidmoham) on 7/21/16.
 */
import java.util.*;
public class Problem337A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        int[] puzz = new int[m];
        int a = 0, b = n - 1;
        for (int i = 0; i < m; i++){
            puzz[i] = s.nextInt();
        }
        Arrays.sort(puzz);
        int ans = Math.abs(puzz[b] - puzz[a]);
        int diff = Math.abs(puzz[b] - puzz[a]);
        //System.out.println("Initial Case: " + puzz[b] + " - " + puzz[a] + " = " + ans + "\n" + "-----------------"); debugging line
        for (int i = 0; i < b; i++) {
            diff = puzz[b] - puzz[a];
            //System.out.println(puzz[b] + " - " + puzz[a] + " = " + diff); debugging line
            if (b < puzz.length - 1){
                b++;
                a++;
            }
            ans = Math.min(ans, diff);
        }
        System.out.println(ans);
    }
}
