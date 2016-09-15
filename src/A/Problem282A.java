package A;

import java.util.*;
public class Problem282A {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		n++;
		int x = 0;
		String[] ar = new String[n];
		String p1 = "x++";
		String p2 = "++x";
		String m1 = "x--";
		String m2 = "--x";
		for (int i = 0; i < n; i++)
		{
			ar[i] = s.nextLine();
		}
		s.close();
		for (int i = 0; i < n; i++)
		{
			if (ar[i].equalsIgnoreCase(p1) || ar[i].equalsIgnoreCase(p2))
			{
				x++;
			}
			else if (ar[i].equalsIgnoreCase(m1) || ar[i].equalsIgnoreCase(m2))
			{
				x--;
			}
		}
		System.out.println(x);
	}
}
