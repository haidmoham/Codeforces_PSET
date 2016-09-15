package A;

import java.util.*;

public class Problem118A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String in = s.next();
		s.close();
		String out = in.replaceAll("[AEIOUYaeiouy]", "");
		out = out.toLowerCase();
		out = out.replaceAll("", ".");
		out = out.substring(0, out.length()-1);
		System.out.println(out);
	}
}
