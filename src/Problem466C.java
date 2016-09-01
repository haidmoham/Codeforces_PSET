/**
 * Created by mohammad on 8/28/16.
 */
import java.util.*;

public class Problem466C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] in = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            in[i] = sc.nextInt();
            sum += in[i];
        }
    }
}
