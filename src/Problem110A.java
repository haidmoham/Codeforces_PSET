/**
 * Created by Mohammad Haider (haidmoham) on 7/19/16.
 */
import java.util.*;

public class Problem110A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        long length, ldg;
        ldg = 0;
        length = in.length();
        for (int i = 0; i < length; i++){
            if(in.charAt(i) == '4' || in.charAt(i) == '7')
                ldg++;
            //System.out.println(in.charAt(i) + " " + ldg);
        }
        if(ldg == 4 || ldg == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
