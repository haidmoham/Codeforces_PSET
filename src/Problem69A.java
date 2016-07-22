/**
 * Created by Mohammad Haider (haidmoham) on 7/22/16.
 */
import java.util.*;

public class Problem69A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        int xsum = 0, ysum = 0, zsum = 0;
        for (int i = 0; i < n; i++){
            x[i] = s.nextInt();
            y[i] = s.nextInt();
            z[i] = s.nextInt();
            xsum += x[i];
            ysum += y[i];
            zsum += z[i];
        }
        if (xsum == 0 && ysum == 0 && zsum == 0)
            System.out.println("YES");
        else System.out.println("NO");
    }
}
