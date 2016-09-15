package A; /**
 * Created by Mohammad Haider (haidmoham) on 7/22/16.
 */
import java.util.*;

public class Problem580A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int prev = s.nextInt(), next, max = 1, sum = 1;
        for (int i = 0; i < n -1; i++){
            next = s.nextInt();
            if (prev > next)
                sum = 1;
            else
                sum++;
            max = (sum > max) ? sum : max; //TIL this is a ternary operator
            prev = next;
        }
        System.out.println(max);
    }
}