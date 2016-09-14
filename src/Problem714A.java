/**
 * Created by mo on 9/13/16.
 */
import java.util.*;

public class Problem714A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long l1 = sc.nextLong(), r1 = sc.nextLong(), l2 = sc.nextLong(), r2 = sc.nextLong(), k = sc.nextLong();
        long start = Math.max(l1, l2);
        long end = Math.min(r1, r2);
        long time = end - start + 1;
        if (k >= start && k <= end) time--;
        if (time < 0) time = 0;
        System.out.println(time);
    }
}