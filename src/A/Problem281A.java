package A; /**
 * Created by Mohammad Haider (haidmoham) on 7/17/16.
 */
import java.util.*;

public class Problem281A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        String pref = in.substring(0, 1);
        String rest = in.substring(1, in.length());
        String out = pref.toUpperCase() + rest;
        System.out.println(out);
    }
}
