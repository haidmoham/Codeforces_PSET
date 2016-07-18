/**
 * Created by mohammad on 7/10/16.
 */
import java.util.*;
public class Problem266A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String temp = s.nextLine();
        char[] stones = new char[n];
        int count = 0;
        for (int i = 0; i < n; i++)
            stones[i] = temp.charAt(i);
        for (int i = 1; i < n; i++)
        {
            if (stones[i-1] == stones[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
