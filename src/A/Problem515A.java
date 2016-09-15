package A; /**
 * Created by mohammad on 8/19/16.
 */
import java.util.*;

public class Problem515A{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = Math.abs(in.nextInt());
        int b = Math.abs(in.nextInt());
        int s = Math.abs(in.nextInt());
        System.out.println((a+b) > s || (a + b) %2 != s % 2 ? "NO":"YES");
    }
}