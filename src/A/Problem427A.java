package A; /**
 * Created by mohammad on 8/19/16.
 */
import java.util.*;

public class Problem427A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        int n = 0;
        int count = 0, ans = 0;
        while (time-- > 0){
            n = sc.nextInt();
            count += n;
            if (count == -1){
                ans++;
                count = 0;
            }
        }
        System.out.println(ans);
    }
}
