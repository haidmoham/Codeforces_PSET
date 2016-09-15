package A;

import java.util.Scanner;
public class Problem270A {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            int th = s.nextInt();
            if (360 % (180 - th) == 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}