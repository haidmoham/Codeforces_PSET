/**
 * Created by Mohammad Haider (haidmoham) on 7/18/16.
 */
import java.util.*;

public class Problem546A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int k, n, w;
        k = s.nextInt();
        n = s.nextInt();
        w = s.nextInt();
        int d = k;
        for (int i = 2; i <= w; i++){
            d += k * i;
            //System.out.println(d);
        }
        if (d > n){
            d = d - n;
        }
        else
        {
            d = 0;
        }
        System.out.println(d);
    }
}
