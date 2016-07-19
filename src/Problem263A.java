/**
 * Created by Mohammad Haider (haidmoham) on 7/18/16.
 */
import java.util.*;

public class Problem263A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[][] m = new int[6][6];
        for(int i = 0; i <= 5; i++){
            for (int j = 0; j <= 5; j++){
                m[i][j] = s.nextInt();
            }
        }
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                if(m[i][j] == 1){
                    System.out.println(Math.abs(3-i) + Math.abs(3-j));
                }
            }
        }
    }
}
