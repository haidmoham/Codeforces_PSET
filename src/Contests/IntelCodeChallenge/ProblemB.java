import java.util.*;

public class ProblemB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] in = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++){ 
				in[i][j] = sc.nextInt();
			}
		}
		boolean bool = true;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < m-1; j++) {
				if (in[i][j] == in[i][j+1] || in[i][j] == in[i+1][j] || in[i][j] == in[i+1][j+1]) {
					bool = true;
				}
				else bool = false;
			}
		}
		System.out.println(bool ? "YES" : "NO");
		
	}
	public static void print2d(int[][] in, int n, int m){
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++){
				System.err.print(in[i][j] + " ");
			}
			System.err.println();
		}
	}
}
