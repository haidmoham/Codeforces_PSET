/**
 * Created by Mohammad Haider on 7/23/2016.
 */
import java.util.*;
public class Problem208A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String in = s.next();
        String out = in.replaceAll("WUB", " ");
        out = out.trim();
        System.out.println(out);
    }
}
