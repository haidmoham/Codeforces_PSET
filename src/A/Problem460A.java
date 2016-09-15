package A; /**
 * Created by mohammad on 7/26/16.
 */
import java.util.*;

public class Problem460A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        System.out.println(n + ((n-1)/(m-1)));
    }
}
