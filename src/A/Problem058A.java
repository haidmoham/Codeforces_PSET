package A; /**
 * Created by Mohammad Haider (haidmoham) on 7/17/16.
 */
import java.util.*;
public class Problem058A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String in, out, hello;
        out = null;
        hello = "hello";
        int i, j;

        while(s.hasNext()){
            in = s.next();
            out = "NO";
            for (j = i = 0; i < in.length(); i++){
                if (in.charAt(i) == hello.charAt(j)){
                    if (++j == 5){
                        out = "YES";
                        break;
                    }
                }
            }
        }
        System.out.println(out);
    }
}
