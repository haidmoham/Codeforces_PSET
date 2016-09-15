package A; /**
 * Created by mohammad on 7/25/16.
 */
import java.util.*;

public class Problem230A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (s > arr[i][0]){
                s += arr[i][1];
                arr[i] = arr[n-1];
                i = -1;
                n--;
            }
        }
        if (n == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
