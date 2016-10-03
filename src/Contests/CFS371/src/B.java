/**
 * Created by mo on 9/13/16.
 */
import java.io.*;
import java.util.*;

public class B {
    public static void main(String[] args){
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < n; i++)
            set.add(sc.nextLong());
        if (set.size() > 3){
            System.out.println("NO");
        }
        else {
            if (set.size() < 3){
                System.out.println("YES");
            }
            else {
                Long[] arr = new Long[3];
                arr = set.toArray(arr);
                long diff1 = arr[1] - arr[0];
                long diff2 = arr[2] - arr[1];
                if (diff1 == diff2) {
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }
        }
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
