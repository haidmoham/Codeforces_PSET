/**
 * Created by mohammad on 7/24/16.
 */
import java.util.*;

public class Problem520A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String in = s.next();
        char[] ch = new char[n];
        HashSet<Character> contains = new HashSet<Character>();
        for (int i = 0; i < n; i++){
           contains.add(Character.toLowerCase(in.charAt(i)));
        }
        if (contains.size()< 26){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
