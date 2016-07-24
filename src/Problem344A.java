/**
 * Created by mohammad on 7/24/16.
 */
import java.util.*;
public class Problem344A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] magnets = new int[n];
        int count = 1;
        for (int i = 0; i < n; i++)
            magnets[i] = s.nextInt();
        for (int i = 1; i < n; i++) {
            if (magnets[i-1] != magnets[i])
                count++;
        }
        System.out.println(count);
    }
}
