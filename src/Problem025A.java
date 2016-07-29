/**
 * Created by mohammad on 7/28/16.
 */
import java.util.*;

public class Problem025A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] in = new int[n];
        int esum = 0;
        int osum = 0;
        int index = 0;
        for (int i = 0; i < n; i++){
            in[i] = s.nextInt();
            if (in[i]%2 == 0) esum++;
            if (in[i]%2 == 1) osum++;
        }
        for (int i = 0; i < n; i++) {
            if (esum > osum) {
                if (in[i]%2 == 1) index = i;
            }
            if (esum < osum) {
                if (in[i]%2 == 0) index = i;
            }
        }
        System.out.println(index+1);
    }
}
