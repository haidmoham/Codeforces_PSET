import java.util.*;

public class Problem158A {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int length;
		ArrayList<Integer> ar = new ArrayList<>(n);
		for (int i = 0; i < n; i++){
			ar.add(s.nextInt());
		}
		s.close();
		int pass = ar.get(k-1);
		for (int i = 0; i < n; i++){
			if (ar.get(i) < pass)
			{
				ar.set(i, 0);
			}
		}
		ar.removeAll(Collections.singleton(0));
		if (!ar.isEmpty())
			length = ar.size();
		else
			length = 0;
		System.out.println(length);
	}
}
