package B;

import java.util.*;

public class Problem158BGreedy {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Integer[] ar = new Integer[n];
		int result = 0;
		for (int i = 0; i < n; i++) {
			ar[i] = s.nextInt();
		}
		Arrays.sort(ar, Collections.reverseOrder());
		s.close();
		int i = 0;
		int j = n - 1;
		while (i <= j)
		{
			int four = 4 - ar[i];
			while (ar[j] <= four && (j >= 1))
			{
				four -= ar[j];
				j--;
			}
			i++;
			result++;
		}
		System.out.println(result);
	}
}
