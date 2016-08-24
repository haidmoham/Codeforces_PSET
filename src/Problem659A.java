/**
 * Created by mohammad on 8/23/16.
 */
import java.util.*;

public class Problem659A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        System.out.println(((a - 1 + b) % n + n) % n + 1);
    }
}
