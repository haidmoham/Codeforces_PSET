import java.util.*;
public class Problem158B {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] ar = new int[n];
		int arsum = 0;
		int result = 0;
		for (int i = 0; i < n; i++)
		{
			ar[i] = s.nextInt();
			arsum += ar[i];
		}
		
		s.close();
		result = arsum / 4;
		if (arsum % 4 != 0)
		{
			result++;
		}
		System.out.println(result);
	}
}
