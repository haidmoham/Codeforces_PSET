package A; /**
 * Created by mohammad on 7/28/16.
 */
import java.util.*;

public class Problem320A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();
        System.out.println(in.matches("(1|14|144)+") ? "YES" : "NO");
    }
}
