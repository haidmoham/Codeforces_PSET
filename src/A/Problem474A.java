package A; /**
 * Created by mohammad on 8/24/16.
 */
import java.util.*;


public class Problem474A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "qwertyuiopasdfghjkl;zxcvbnm,./";
        String input = sc.next();
        String m = sc.next();
        int a = ((input.equals("R") ? -1 : 1));
        for (int i = 0; i < m.length(); i++){
            System.out.print((s.charAt(s.indexOf(m.charAt(i)) + a)));
        }
    }
}
