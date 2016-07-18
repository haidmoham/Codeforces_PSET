import java.util.*;

public class TerribleChandu {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] ar = new String[n];
		for (int i = 0; i < n; i++) {
			ar[i] = s.nextLine();
		}
		s.close();
		String[] rev = new String[n];
		for (int i = 0; i < n; i++) {
			rev[i] = new StringBuilder(ar[i]).reverse().toString();
		}
		for (int i = 0; i < n; i++)
			System.out.print(rev[i]);
	}
}
