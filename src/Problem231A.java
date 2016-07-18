import java.util.*;

public class Problem231A {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		n++;
		String[] ar = new String[n];
 		for (int i = 0; i < n; i++)
		{
			ar[i] = s.nextLine();
		}
 		s.close();
 		int count = 0;
 		String acc1 = "0 1 1";
 		String acc2 = "1 0 1";
 		String acc3 = "1 1 0";
 		String acc4 = "1 1 1";
 		for (int i = 0; i < n; i++)
 		{
 			if (ar[i].equals(acc1) || ar[i].equals(acc2) || ar[i].equals(acc3) || ar[i].equals(acc4))
 				count++;
 		}
 		System.out.println(count);
	}
}