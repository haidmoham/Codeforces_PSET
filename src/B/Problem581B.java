package B; /**
 * Created by mo on 9/14/16.
 */
import java.util.*;
import java.io.*;


public class Problem581B {
    public static void main(String[] args){
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int[] b = new int[n];
        b[n-1] = 0;
        int max = a[n-1];
        StringBuilder sb = new StringBuilder();
        for (int i = b.length - 2; i >= 0; i--){
            if (a[i] <= max) b[i] = max + 1 - a[i];
            else {
                max = a[i];
                b[i] = 0;
            }
        }
        for (int i : b) sb.append(i).append(' ');
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