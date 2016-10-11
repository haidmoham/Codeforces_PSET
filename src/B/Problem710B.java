package B; /**
 * Created by mohammad on 8/26/16.
 */
import java.util.*;

public class Problem710B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] in = new Integer[n];
        for (int i = 0; i < n; i++)
            in[i] = sc.nextInt();
        Arrays.sort(in);
        System.out.println(in[(n-1)/2]);
    }
}