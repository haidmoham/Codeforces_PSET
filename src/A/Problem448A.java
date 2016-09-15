package A; /**
 * Created by mohammad on 8/24/16.
 */
import java.util.*;

public class Problem448A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() + sc.nextInt() + sc.nextInt();
        int b = sc.nextInt() + sc.nextInt() + sc.nextInt();
        System.out.println((a + 4) / 5 + (b + 9) / 10 <= sc.nextInt() ? "YES" : "NO");
    }
}
