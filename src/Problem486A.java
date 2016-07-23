/**
 * Created by Mohammad Haider on 7/23/2016.
 */
import java.util.*;

public class Problem486A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long sum = 0;
        if (n%2 == 0){
            sum = n/2;
        }
        else
            sum = -1 * (n/2 + 1);
        System.out.println(sum);
    }
}
