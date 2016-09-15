package A; /**
 * Created by Mohammad Haider (haidmoham) on 7/19/16.
 */
import java.util.*;

public class Problem688A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, d, count, f, maxcount;
        n = s.nextInt();
        d = s.nextInt();
        count = 0;
        String fail = "1";
        maxcount = 0;
        for (int i = 1; i < n; i++) {
            fail += "1";
        }

        String[] opp = new String[d];
        for (int i = 0; i < d; i++) {
            opp[i] = s.next();
            if (!opp[i].equals(fail)) {
                count++;
                if (count > maxcount)
                    maxcount = count;
            } else
                count = 0;
        }
        System.out.println(maxcount);
    }

}
