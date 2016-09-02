/**
 * Created by mohammad on 8/27/16.
 */
import java.util.*;

public class Problem675A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        if (c == 0) {
            if (a == b) System.out.println("YES");
            else System.out.println("NO");
        }
        else {
            if ((b - a) % c == 0 && (b - a)/ c >= 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
