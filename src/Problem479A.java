/**
 * Created by Mohammad Haider (haidmoham) on 7/22/16.
 */
import java.util.*;

public class Problem479A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
        int poss1, poss2, poss3, poss4, poss5;
        poss1 = a + (b * c);
        poss2 = a * (b + c);
        poss3 = a * b * c;
        poss4 = (a + b) * c;
        poss5 = a + b + c;
        int ans1 = Math.max(poss1, poss2);
        int ans2 = Math.max(poss3, poss4);
        int ans3 = Math.max(poss4, poss5);
        ans2 = Math.max(ans2, ans3);
        System.out.println(Math.max(ans1, ans2));
    }
}
