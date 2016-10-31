package B; /**
 * Created by mo on 10/25/16.
 */

import java.util.*;
import java.io.*;

import static java.lang.Math.*;

public class Problem279B {
    public static void main(String[] args) {
        //FastScanner sc = new FastScanner();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println(maxLength(a, k));
    }
    static int maxLength(int[] a, int k) {
        int n = a.length;
        int j = 0;
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            while (j < n && sum + a[j] <= k) {
                sum += a[j];
                j += 1;
            }
            ans = Math.max(ans, j - i);
            sum -= a[i];
        }
        return ans;
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
