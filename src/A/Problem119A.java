package A; /**
 * Created by Mohammad Haider (haidmoham) on 7/22/16.
 */
import java.math.BigInteger;
import java.util.*;

public class Problem119A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), n = s.nextInt();
        int count = 0;
        int simon = 0;
        while (n > 0){
            if (count%2 == 0){
                n = n - findGCD(a, n);
                simon = 0;
            }
            else{
                n = n - findGCD(b, n);
                simon = 1;
            }
            count++;
        }
        System.out.println(simon);
    }
    public static int findGCD(int a, int n){
        BigInteger b1 = new BigInteger(""+a);
        BigInteger b2 = new BigInteger(""+n);
        BigInteger gcd = b1.gcd(b2);
        return gcd.intValue();

    }
}
