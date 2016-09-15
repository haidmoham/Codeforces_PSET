package B; /**
 * Created by Mohammad Haider (haidmoham) on 7/21/16.
 */
import java.util.*;

public class Problem266B {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), t = s.nextInt();
        String kids = s.next();
        for (int i = 1; i <= t; i++)
            kids = kids.replaceAll("BG", "GB");
        System.out.println(kids);
    }
}
