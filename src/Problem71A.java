import java.util.*;

public class Problem71A {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++){
			arr[i] = s.next();
		}
		s.close();
		for (int i = 0; i < n; i++){
			if (arr[i].length() > 10){
				char pref = arr[i].charAt(0);
				char suf = arr[i].charAt((arr[i].length() - 1 ));
				int abb = (arr[i].length() - 2);
				String mid = Integer.toString(abb);
				String abbd = pref + mid + suf;
				arr[i] = abbd;
			}
		}
		
		for (int i = 0; i < n; i++)
			System.out.println(arr[i]);
	}
}
