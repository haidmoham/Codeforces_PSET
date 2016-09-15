package A; /**
 * Created by mohammad on 8/23/16.
 */
import java.util.*;

public class Problem510A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int y = scan.nextInt();
        int x = scan.nextInt();
        for(int i = 1; i <= y; i++){
            for(int j = 1; j<=x; j++){
                if(i % 2 == 1) System.out.print("#");
                else if(i % 4 == 2 && j == x) System.out.print("#");
                else if(i % 4 == 0 && j == 1) System.out.print("#");
                else System.out.print(".");
            }
            System.out.println();
        }
    }
}
