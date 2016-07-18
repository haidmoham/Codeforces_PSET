import java.util.*;
public class Problem50A {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int M = s.nextInt();
		int N = s.nextInt();
		s.close();
		int area = M * N;
		int result = area / 2;
		System.out.println(result);
	}
}
