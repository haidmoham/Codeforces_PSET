/**
 * Created by mohammad on 7/27/16.
 */
import java.util.*;

public class Problem488A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String in = s.next();
        long a = Long.parseLong(in);
        a++;
        String out = String.valueOf(a);
        long b = 1;
        while (!(out.contains("8"))){
            a++;
            b++;
            out = String.valueOf(a);
        }
        System.out.println(b);
    }
}
