package A;/**
 * Created by mo on 10/5/16.
 */

import java.util.*;
import java.io.*;

public class Problem722A {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int h = sc.nextInt();
        String[] line = sc.readNextLine().split(":");

        int hour = Integer.parseInt(line[0]);
        if (h == 12 && hour > 12){
            hour %= 10;
        }
        else if (hour > 23) {
            hour %= 10;
        }
        if (h == 12 && hour == 0) hour += 10;

        int min = Integer.parseInt(line[1]);
        if (min > 59)
            min %= 10;

        System.out.printf("%02d:%02d\n", hour, min);
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
