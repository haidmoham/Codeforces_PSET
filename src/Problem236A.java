/**
 * Created by Mohammad Haider (haidmoham) on 7/18/16.
 */
import java.util.*;
public class Problem236A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        char[] ch = new char[in.length()];
        String out = "IGNORE HIM!";
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < in.length(); i++){
            ch[i] = in.charAt(i);
            set.add(ch[i]);
        }
        int size = set.size();
        if (size%2 == 0) {
            out = "CHAT WITH HER!";
        }
        System.out.println(out);
    }
}
