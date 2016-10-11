package B;/**
 * Created by mo on 10/4/16.
 */

import java.util.*;
import java.io.*;

public class Problem723B {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        char[] ch = sc.readNextLine().toCharArray();
        int maxOut = 0, current = 0, in_paren = 0, paren_count = 0;
        boolean paren = false;
        for (int i = 0; i < n; i++){
            if (current > maxOut)
                maxOut = current;
            if (ch[i] == '('){
                paren = true;
                current = 0;
                paren_count = 0;
                continue;
            }
            if (ch[i] == ')'){
                if (paren_count > 0)
                    in_paren++;
                paren = false;
                continue;
            }
            if (ch[i] == '_'){
                if (paren_count > 0 && paren) {
                    in_paren++;
                }
                current = 0;
                paren_count = 0;
                continue;
            }
            if (!paren) {
                current++;
                paren_count = 0;
            }
            else {
                paren_count++;
            }
        }
        if (current > maxOut)
            maxOut = current;
        System.out.println(maxOut + " " + in_paren);
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
