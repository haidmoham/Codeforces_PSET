package A; /**
 * Created by mohammad on 7/25/16.
 */
import java.util.*;

public class Problem540A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String first = s.next();
        String second = s.next();
        int[] start = new int[n];
        int[] soln = new int[n];
        int diff1 = 0;
        int moves = 0;
        for (int i = 0; i < n; i++) {
            start[i] = Character.getNumericValue(first.charAt(i));
            soln[i] = Character.getNumericValue(second.charAt(i));
            diff1 = start[i] - soln[i];
            moves += Math.min(Math.abs(diff1), 10 - Math.abs(diff1));
        }
        System.out.println(moves);
    }
}
