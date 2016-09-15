package A; /**
 * Created by Mohammad Haider (haidmoham) on 7/22/16.
 */
import java.util.*;
public class Problem041A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        String rs = new StringBuilder(s).reverse().toString();
        if (rs.equals(t))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
