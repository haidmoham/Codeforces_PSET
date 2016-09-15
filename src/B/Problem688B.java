package B; /**
 * Created by mohammad on 8/26/16.
 */
import java.util.*;

public class Problem688B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String in = sc.next();
        StringBuilder sb = new StringBuilder();
        sb.append(in);
        String rev = sb.reverse().toString();
        System.out.println(in + rev);
    }
}
