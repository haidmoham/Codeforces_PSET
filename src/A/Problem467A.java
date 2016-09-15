package A; /**
 * Created by Mohammad Haider (haidmoham) on 7/18/16.
 */
import java.util.*;

public class Problem467A {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p, q, occ, count;
        count = 0;
        int[][] rooms = new int[n][2];
        for (int i = 0; i < n; i++){
            p = s.nextInt();
            q = s.nextInt();
            rooms[i][0] = p;
            rooms[i][1] = q;
            //System.out.println(rooms[i][0] + " " + rooms[i][1]);
        }
        for (int i = 0; i < n; i++){
            occ = rooms[i][1] - rooms[i][0];
            if (occ >= 2){
                count++;
            }
        }
        System.out.println(count);
    }
}
