package Contests.CFS359;

import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long x = sc.nextLong();
        int d = 0;
        for (int i = 0; i < n; i++){
            String k = sc.next();
            long temp = sc.nextLong();
            if (k.equals("+")){
                x += temp;
            }
            else {
                if (x < temp)
                    d++;
                else
                    x -= temp;
            }
        }
        System.out.print(x + " ");
        System.out.println(d);
    }

}