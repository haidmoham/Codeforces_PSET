package A;

import java.util.*;

public class Problem112A {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String in1 = s.nextLine(), in2 = s.nextLine();
        System.out.println(in1.compareToIgnoreCase(in2) == 0 ? 0 : in1.compareToIgnoreCase(in2) < 0 ? -1 : 1);
	}
}
