package A;

import java.util.*;

public class Problem131A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		s.close();
		char ch[] = new char[in.length()];
		boolean caps[] = new boolean[in.length()];
		boolean cl = true;
		boolean cl2 = true;
		String pref, rest;
		String out = in;
		for (int i = 0; i < in.length(); i++) {

			ch[i] = in.charAt(i);
			if (Character.isUpperCase(ch[i]))
			{
				caps[i] = true;
			}
			//System.out.println(ch[i] + " " + caps[i]);
		}
		for (int i = 1; i < in.length(); i++)
		{
			if (!caps[i])
			{
				cl = false;
				break;
			}
		}
		for (int i = 0; i < in.length(); i++)
		{
			if (!caps[i])
			{
				cl2 = false;
				break;
			}
		}
		//System.out.println(cl + " " + cl2);
		if (cl && !cl2)
		{
			pref = in.substring(0, 1);
			rest = in.substring(1, in.length());
			pref = pref.toUpperCase();
			rest = rest.toLowerCase();
			out = pref + rest;
		}
		else if (cl2)
		{
			out = in.toLowerCase();
		}
		System.out.println(out);
	}
}
