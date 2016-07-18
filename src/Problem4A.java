import java.util.*;

public class Problem4A {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		
		if (w == 2) {
			System.out.println("NO");
			return;	
		}
		else if (w % 2 == 0) {
			System.out.println("YES");
		}
		else
			System.out.println("NO");
	}
}
