/**
 * Created by mohammad on 7/27/16.
 */
import java.util.*;

public class Problem492B {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int l = s.nextInt();
        double max = 0;
        int[] lanterns = new int[n];
        for (int i = 0; i < n; i++)
            lanterns[i] = s.nextInt();
        Arrays.sort(lanterns);
        max = Math.max(max, lanterns[0]);
        max = Math.max(max, l-lanterns[n-1]);

        for(int i = 0;i<n-1;i++){
            max = Math.max(max, (lanterns[i+1]-lanterns[i])/2.0);
        }

        System.out.println(max);
    }
}
