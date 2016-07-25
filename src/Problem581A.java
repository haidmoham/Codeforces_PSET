/**
 * Created by mohammad on 7/25/16.
 */
import java.util.*;

public class Problem581A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int fashion = Math.min(a, b);
        int normal;
        if (a > b){
            normal = a - fashion;
        }
        else
            normal = b - fashion;
        System.out.println(fashion + " " + (normal / 2));
    }
}
