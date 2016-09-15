package A; /**
 * Created by mohammad on 7/27/16.
 */
import java.util.*;

public class Problem141A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String first = s.next();
        String second = s.next();
        String joke = s.next();
        String comb = first + second;
        char[] ch1 = comb.toCharArray();
        char[] ch2 = joke.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        StringBuilder sb = new StringBuilder();
        CharSequence chars = sb.append(ch1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(ch2);
        joke = sb2.toString();
        //System.out.println(chars);
        //System.out.println(joke);
        if (joke.contains(chars) && comb.length() >= joke.length()){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
