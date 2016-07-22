/**
 * Created by Mohammad Haider (haidmoham) on 7/22/16.
 */
import java.util.*;
public class Problem472A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        int x, y;
        y = (int)Math.floor(n/2);
        x = (int)Math.ceil(n/2);
        for (int i = 6; i < n; i++) {
            if (!isPrime(x) && !isPrime(y)) {
                break;
            }
            else {
                y++;
                x--;
            }
        }
        System.out.println(x + " " + y);
    }
    private static boolean isPrime(int num){
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}
