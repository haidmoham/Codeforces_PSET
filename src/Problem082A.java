/**
 * Created by Mohammad Haider (haidmoham) on 7/21/16.
 */
import java.util.*;

public class Problem082A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n > 5) {
            n -= 5;
            n = (n + 1) / 2;
        }
        String[] a = {"Sheldon", "Leonard", "Penny", "Rajesh", "Howard"};
        System.out.println();
    }
}
