package A;

import java.util.*;

public class Problem116A {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int in, out, cap, maxCap = 0;
		
		out = s.nextInt();
		in = s.nextInt();
		
		cap = in - out;
		maxCap = cap;
		for (int i = 1; i < n; i++)
		{
			out = s.nextInt();
			in = s.nextInt();
			
			cap += in - out;
			if (maxCap < cap)
			{
				maxCap = cap;
			}
		}
		System.out.println(maxCap);
	}
}
