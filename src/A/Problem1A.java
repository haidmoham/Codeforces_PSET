package A;

import java.util.*;

public class Problem1A {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		long a = s.nextInt();
		
		double area = n * m;
		long flag = a * a;
		int result = (int) (flag / area);
		System.out.println(result);
		s.close();
	}
}
