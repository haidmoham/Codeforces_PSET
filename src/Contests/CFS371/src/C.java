/**
 * Created by mo on 9/14/16.
 */
import java.io.*;
import java.util.*;

public class C {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int[] freqs = new int[1 << 18];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            char type = sc.next().charAt(0);
            String num = sc.next();
            if (type == '+'){
                int pattern = numToPattern(num);
                freqs[pattern]++;
            }
            else if (type == '-'){
                int pattern = numToPattern(num);
                freqs[pattern]--;
            }
            else {
                int pattern = Integer.parseInt(num, 2);
                sb.append(freqs[pattern]).append('\n');
            }
        }
        System.out.println(sb);
    }
    private static int numToPattern(String num) {
        int pattern = 0;
        for (int i = 0; i < num.length(); i++){
            int digit = num.charAt(num.length() - i - 1) - '0';
            if (digit % 2 == 1){
                pattern |= (1 << i);
            }
        }
        return pattern;
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
