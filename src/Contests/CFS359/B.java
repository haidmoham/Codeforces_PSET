package Contests.CFS359;

import java.util.*;

public class B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] ar = new long[n];

        for (int i = 0; i < n; i++){
            ar[i] = sc.nextLong();
        }
        if (n == 1)
        {
            return;
        }
        int l = 0;
        int r = 0;
        long temp = 0;

        for (int c = 0; c < 20000; c++)
        {
            if (r == n){
                l = 0;
                r = 1;
            }
            if (ar[l] > ar[r]) {
                System.out.println((l+1) + " " + (r+1));
                temp = ar[l];
                ar[l] = ar[r];
                ar[r] = temp;
            }
            l++;
            r++;
        }
    }
}