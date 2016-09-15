package A; /**
 * Created by mohammad on 7/25/16.
 */
import java.util.*;

public class Problem228A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] shoes = new int[4];
        int sum = 0;
        for (int i = 0; i < 4; i++){
            shoes[i] = s.nextInt();
        }
        Arrays.sort(shoes);
        for (int i = 1; i < 4; i++){
            if (shoes[i] == shoes[i-1])
                sum++;
        }
        System.out.println(sum);
    }
}
