/**
 * Created by mohammad on 8/1/16.
 */
import java.util.*;

public class Problem237A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int ans = 0;

        int[] time = new int[10000];


        for(int i =0; i< n; i++){
            int index = s.nextInt()* 60 + s.nextInt();
            ans = Math.max(ans, ++time[index]);
        }
        System.out.println(ans);
    }
}

