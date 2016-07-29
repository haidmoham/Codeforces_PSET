/**
 * Created by mohammad on 7/28/16.
 */
import java.util.*;

public class Problem478A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] bet = new int[5];
        int arsum = 0;
        for (int i = 0; i < 5; i++) {
            bet[i] = s.nextInt();
            arsum += bet[i];
        }
        if (arsum%5 == 0 && arsum != 0){
            System.out.println(arsum/5);
        }
        else System.out.println(-1);
    }
}
