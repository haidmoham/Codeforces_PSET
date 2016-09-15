package A; /**
 * Created by mohammad on 7/26/16.
 */
import java.util.*;

public class Problem313A {
    public static void main(String[] args){
        long acc = new Scanner(System.in).nextLong();
        if(acc < 0)
            acc = Math.max(acc/100*10 + acc%10, acc/10);
        System.out.print(acc);
    }
}
