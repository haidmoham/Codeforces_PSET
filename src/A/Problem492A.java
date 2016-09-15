package A; /**
 * Created by mohammad on 7/26/16.
 */
import java.util.*;

public class Problem492A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 0;
        int j = 1;
        while (!(n < j)) {
            i++;
            j += i;
            n -= j;
            //System.out.println(n + " " + i);
        }
        System.out.println(i);
    }
}
