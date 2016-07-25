/**
 * Created by mohammad on 7/25/16.
 */
import java.util.*;

public class Problem584A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = s.nextInt();
        String out = "";
        if (t == 10) {
            if (n == 1) {
                out = "-1";
            }
            else if (n > 1){
               for (int i = 0; i < n - 1; i++){
                   out += "1";
               }
               out += "0";
            }
        }
        else if (t < 10){
            for (int i = 0; i < n; i++){
                out += t;
            }
        }
        else {
            out = "-1";
        }
        System.out.println(out);
    }
}
