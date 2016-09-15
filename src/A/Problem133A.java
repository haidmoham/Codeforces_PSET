package A; /**
 * Created by mohammad on 7/10/16.
 */
import java.util.*;

public class Problem133A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        int length = in.length();
        char ch[] = new char[length];
        boolean tf = false;
        for (int i = 0; i < length; i++)
        {
            ch[i] = in.charAt(i);
            if(ch[i] == 'H' || ch[i] == 'Q' || ch[i] == '9')
            {
                tf = true;
            }
        }
        if (tf)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
