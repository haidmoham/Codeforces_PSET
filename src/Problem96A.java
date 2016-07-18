import java.util.*;

public class Problem96A {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		s.close();
		String no1 = "1111111";
		String no0 = "0000000";
		if (in.contains(no1) || in.contains(no0))	
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
