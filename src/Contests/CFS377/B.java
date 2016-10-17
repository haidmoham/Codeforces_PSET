package Contests.CFS377; /**
 * Created by mo on 10/17/16.
 */

import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) {
        //FastScanner sc = new FastScanner();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] in = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            in[i] = sc.nextInt();
            total += in[i];
        }
        for (int i = 0; i < n; i++){
            if (i == n - 1)
                continue;
            int val = in[i] + in[i+1];
            if (val < k)
                in[i+1] = k - in[i];
        }
        int nT = 0;
        for (int i = 0; i < n; i++)
            nT += in[i];
        System.out.println(nT - total);
        for (int i = 0; i < n; i++)
            System.out.print(in[i] + " ");
    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(Reader in) {
            br = new BufferedReader(in);
        }

        public FastScanner() {
            this(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String readNextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        int[] readIntArray(int n) {
            int[] a = new int[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextInt();
            }
            return a;
        }

        long[] readLongArray(int n) {
            long[] a = new long[n];
            for (int idx = 0; idx < n; idx++) {
                a[idx] = nextLong();
            }
            return a;
        }
    }
}
