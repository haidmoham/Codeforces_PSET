package C; /**
 * Created by mohammad on 8/23/16.
 */
import java.util.*;

public class Problem489C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt(), sum = sc.nextInt(), sum1 = sum - 1;
        if (sum == 0 && length != 1 || sum > 9 * length) {
            System.out.println("-1 -1");
            return;
        }
        String ans1 = "", ans2 = "";
        for (int i = 0; i < length; i++){
            ans1 += Math.min(9, sum);
            sum -= Math.min(9, sum);
        }
        for (int i = 0; i < length - 1; i++){
            ans2 = Math.min(9, sum1) + ans2;
            sum1 -= Math.min(9, sum1);
        }
        ans2 = (sum1 + 1) + ans2;
        System.out.println(ans2 + " " + ans1);
    }
}
