import java.util.*;
import static java.lang.Math.*;

public class ProblemA {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] days = new String[] {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
		String in = sc.nextLine();
		String in2 = sc.nextLine();
		int i1 = Arrays.asList(days).indexOf(in);
		int i2 = Arrays.asList(days).indexOf(in2);
		int diff = (14 + i2 - i1) % 7;
		if (diff == 0 || diff == 2 || diff == 3) {
			System.out.println("YES");
		}
		else System.out.println("NO");
	}
}
