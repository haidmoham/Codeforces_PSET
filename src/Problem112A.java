import java.util.*;

public class Problem112A {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String[] ar = new String[2];
		ar[0] = s.nextLine();
		ar[1] = s.nextLine();
		s.close();
		int result;
		
		
		result = ar[0].compareToIgnoreCase(ar[1]);
		if (result > 0)
		{
			result = 1;
		}
		else if (result < 0)
		{
			result = -1;
		}
		System.out.println(result);
	}
}
