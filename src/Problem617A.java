/**
 * Created by mohammad on 7/25/16.
 */
import java.util.*;

public class Problem617A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int result = n / 5;
        if(n%5!=0)
            result++;
        System.out.println(result);
    }
}
