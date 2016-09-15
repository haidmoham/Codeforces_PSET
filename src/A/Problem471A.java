package A; /**
 * Created by mohammad on 8/24/16.
 */
import java.util.*;

public class Problem471A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] in = new int[6];
        for (int i = 0; i < 6; i++)
            in[i] = sc.nextInt();
        Arrays.sort(in);
        int legs = 0;
        int max = 0;
        for (int i = 0; i < 5; i++){
            if(in[i] == in[i + 1]){
                legs++;
            }
            else {
                max = Math.max(legs, max);
                legs = 0;
            }
        }
        if (legs != 4){
            System.out.println("Alien");
            return;
        }
        else {

        }
    }
}
