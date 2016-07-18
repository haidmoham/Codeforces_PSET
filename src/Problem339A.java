import java.util.*;

public class Problem339A {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String in = s.nextLine();
		s.close();
		String out = in.replace("+", "");
		int len = out.length();
		int[] ar = new int[len];
		for (int i = 0; i < len; i++)
		{
			ar[i] = Integer.parseInt(String.valueOf(out.charAt(i)));
		}
		Arrays.sort(ar);
		String result = "";
		for (int i = 0; i < len; i++)
		{
			result += ar[i] + "+";
		}
		System.out.println(result.substring(0, result.length()-1));
	}
}