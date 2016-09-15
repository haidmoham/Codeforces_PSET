package A; /**
 * Created by mohammad on 7/24/16.
 */
import java.util.*;
public class Problem061A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String first = s.next();
        String second = s.next();
        String out = "";
        int n = first.length();
        for (int i = 0; i < n; i++){
            if (first.charAt(i) != second.charAt(i))
                out += "1";
            else
                out += "0";
        }
        System.out.println(out);
    }
}
