package A; /**
 * Created by mohammad on 8/6/16.
 */
import java.util.*;

public class Problem703A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] in = new int[n][2];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++){
            in[i][0] = s.nextInt();
            in[i][1] = s.nextInt();
            if (in[i][0] > in[i][1])
                sum1++;
            if (in[i][0] < in[i][1])
                sum2++;
        }
        if (sum1 > sum2)
            System.out.println("Mishka");
        else if (sum1 < sum2)
            System.out.println("Chris");
        else
            System.out.println("Friendship is magic!^^");
    }
}
