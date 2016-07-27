/**
 * Created by mohammad on 7/27/16.
 */
import java.util.*;

public class Problem620A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long x1 = s.nextLong();
        long y1 = s.nextLong();
        long x2 = s.nextLong();
        long y2 = s.nextLong();
        System.out.println(Math.max(Math.abs(y2-y1),Math.abs(x2-x1)));
    }
}
