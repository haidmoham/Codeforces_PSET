package A; /**
 * Created by mohammad on 8/24/16.
 */
import java.util.*;

public class Problem144A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), first = 0, last = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){
            int a = sc.nextInt();
            if (a > max){
                max = a;
                first = i;
            }
            if (a <= min){
                min = a;
                last = i;
            }
        }
        System.out.println(first > last ? n - last + first - 2 : n - last + first - 1);
    }
}
