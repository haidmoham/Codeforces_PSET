package Contests.CFS378; /**
 * Created by mo on 10/31/16.
 */

import java.util.*;
import java.io.*;

import static java.lang.Math.*;

public class Problem733A {
    public static final Character[] vow = new Character[] {'A', 'E', 'I', 'O', 'U', 'Y'};
    public static final HashSet<Character> vowels = new HashSet<Character>(Arrays.asList(vow));
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        //Scanner sc = new Scanner(System.in);
        String in = sc.next();
        int n = in.length() + 2;
        char[] ch = new char[n];
        ch[0] = ch[ch.length - 1] = 'A'; //pad with vowel not consanant :(
        for (int i = 1; i < n - 1; i++) {
            ch[i] = in.charAt(i-1);
        }
        //System.out.println(Arrays.toString(ch));
        int temp = 0;
        int out = 0;
        for (int i = 0; i < ch.length; i++) {
            if (!vowels.contains(ch[i])) {
                temp++;
                //System.out.println(temp);
            }
            else {
                out = max(temp, out);
                temp = 1;
            }
        }
        System.out.println(out);
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
