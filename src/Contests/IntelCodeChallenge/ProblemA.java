import java.util.*;

public class ProblemA {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] days = new String[] {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
		String in = sc.nextLine();
		String in2 = sc.nextLine();
		int i1 = Arrays.asList(days).indexOf(in);
		int i2 = Arrays.asList(days).indexOf(in2);
		if (i2 - i1 == 0 || i2 - i1 == 2 || i2 - i1 == 3 || i2 - i1 == -4 || i2 - ii1 == -5) {
			System.out.println("YES");
		}
		else System.out.println("NO");
	}
}
