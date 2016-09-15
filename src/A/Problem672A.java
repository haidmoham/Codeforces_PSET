package A; /**
 * Created by mohammad on 8/11/16.
 */
import java.util.*;

public class Problem672A {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < n * 2; i++)
            sb.append(i);
        String check = sb.toString();
        System.out.println(check.charAt(n-1));
    }
}
