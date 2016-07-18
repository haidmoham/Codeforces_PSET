/**
 * Created by Mohammad Haider (haidmoham) on 7/17/16.
 */
import java.util.*;
public class Problem122A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n%4 == 0 || n%7 == 0 || n%47 == 0 || n%477 == 0){
            System.out.println("YES");
        }
        else
            System.out.println("NO");
    }
}
