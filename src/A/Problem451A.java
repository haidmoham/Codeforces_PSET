package A; /**
 * Created by Mohammad Haider (haidmoham) on 7/22/16.
 */
import java.util.*;
public class Problem451A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int product = n * m;
        int sum = n + m;
        int diff = product - sum;
        if (Math.min(n,m)%2 == 0)
                System.out.println("Malvika");
        else System.out.println("Akshat");
    }
}
