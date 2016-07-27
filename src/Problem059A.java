/**
 * Created by mohammad on 7/27/16.
 */
import java.util.*;
public class Problem059A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String in = s.next();
        int up, low;
        up = 0;
        low = 0;
        for (int i = 0; i < in.length(); i++){
            if (Character.isUpperCase(in.charAt(i))) up++;
            if (Character.isLowerCase(in.charAt(i))) low++;
        }
        if (up > low) System.out.println(in.toUpperCase());
        else System.out.println(in.toLowerCase());
    }
}
