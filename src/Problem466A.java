import java.util.Scanner;


public class Problem466A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int A = s.nextInt();
        int B = s.nextInt();
        System.out.println(Math.min(Math.min(A * N, B * (N / M) + A * (N % M)), B * ((N + M - 1) / M)));
    }
}
