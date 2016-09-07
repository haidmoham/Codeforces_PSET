/**
 * Created by mo on 9/6/16.
 */
import java.util.*;

public class Problem520B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        int count = 0;
        while (m > n) {
            m = m / (2 - m % 2) + (m % 2);
            count++;
        }
        System.out.println(count + n - m);
    }
}
