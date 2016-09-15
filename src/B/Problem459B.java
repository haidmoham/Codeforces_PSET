package B; /**
 * Created by mohammad on 7/27/16.
 */
import java.util.*;

public class Problem459B {
    public static void main(String[] args){
        long startTime = System.nanoTime();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] flowers = new int[n];
        for (int i = 0; i < n; i++)
            flowers[i] = s.nextInt();
        Arrays.sort(flowers);
        int difference = flowers[flowers.length - 1] - flowers[0];
        int i = 0;
        int j = n-1;
        if (flowers[n-1] - flowers[0] > 0){
            while(i < n && flowers[i] == flowers[0]) i++;
            while(j > 0 && flowers[j] == flowers[n-1]) j--;
            System.out.print(difference + " " + (long) (i) * (long) (n-j-1));
        }
        else
            System.out.println(difference + " " + (long) n * (long) (n-1) / 2);
        long endTime = System.nanoTime();
        //System.out.println((endTime - startTime) / 1000000 + " ms");
    }
}
