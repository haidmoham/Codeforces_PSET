package Contests.CFS374;/**
 * Created by mo on 9/30/16.
 */

import java.util.*;
import java.io.*;

public class Problem721A {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        String in = sc.readNextLine();
        int count = 0;
        StringBuilder sb = new StringBuilder();
        int k = 0;
        for (int i = 0; i < n; i++){
            if(in.charAt(i) == 'B') k++;
            else {
                if (k != 0) {
                    sb.append(k + " ");
                    count++;
                }
                k = 0;
            }
        }
        if (k != 0){
            sb.append(k + " ");
            count++;
        }
        k = 0;
        System.out.println(count);
        System.out.println(sb);
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
