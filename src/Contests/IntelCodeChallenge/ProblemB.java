/**
 * Uses elements of Peter Steele's solution
 * (I didn't consider all cases, and then pre-tests during contest
 * also didn't test all cases :^) )
 */

import java.util.*;

public class ProblemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[][] in = new int[n][m];
        int[][] copy = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                int a = sc.nextInt();
                in[i][j] = a;
                copy[i][j] = a;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                swap(copy, i, j);
                if (valid(copy)) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        //print2d(in, n, m);
        //print2d(copy, n , m);
        System.out.println("NO");

    }
    public static void print2d(int[][] in, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                System.err.print(in[i][j] + " ");
            }
            System.err.println();
        }
    }
    public static boolean valid(int[][] in) {
        boolean bool = true;
        for (int i = 0; i < in.length; i++) {
            int off = 0;
            for (int j = 0; j < in[0].length; j++){
                if (in[i][j]-1 != j)
                    off++;
            }
            if (off != 0 && off != 2) bool = false;
        }
        return bool;
    }
    private static void swap(int[][] copy, int a, int b) {
        for (int i = 0; i < copy.length; i++) {
            int temp = copy[i][a];
            copy[i][a] = copy[i][b];
            copy[i][b] = temp;
        }
    }
}
