package A; /**
 * Created by mohammad on 7/26/16.
 */
import java.util.*;

public class Problem268A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] j1 = new int[n];
        int[] j2 = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++){
            j1[i] = s.nextInt();
            j2[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j1[i] == j2[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
