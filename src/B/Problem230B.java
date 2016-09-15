package B; /**
 * Created by mohammad on 9/1/16.
 */
import java.util.*;
import java.util.stream.IntStream;

public class Problem230B {
    public static void main(String[] args) {
        int[] nums = new int[1000001];
        for (int i=2;i<=1000000;i++) {
            nums[i] =1;
        }

        for (int i=2;i<=1000000;i++) {
            for (int j=2;j*i<=1000000;j++) {
                nums[j*i]= 0;
            }
        }
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
            long p = in.nextLong();
            double index = Math.sqrt(p);
            if ((int) index==index && nums[(int) index]==1 ) {
                sb.append("YES" + '\n');
            } else {
                sb.append("NO" + '\n');
            }
        }
        System.out.println(sb.toString());
    }
}
