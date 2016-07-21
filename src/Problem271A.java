/**
 * Created by Mohammad Haider (haidmoham) on 7/21/16.
 */
import java.util.*;

public class Problem271A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        num++;
        while (!hasDistinctDigits(num))
            num++;
        System.out.println(num);
    }
    public static boolean hasDistinctDigits(int number)
    {
        final Set<Integer> set = new HashSet<Integer>();

        while (number > 0) {
            if (!set.add(number % 10))
                return false;
            number /= 10;
        }
        return true;
    }
}
