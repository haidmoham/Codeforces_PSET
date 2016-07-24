/**
 * Created by mohammad on 7/23/16.
 */
import java.util.*;

public class Problem469A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashSet<Integer> p = new HashSet<>();
        HashSet<Integer> q = new HashSet<>();
        int pi = s.nextInt();
        for (int i = 0; i < pi; i++)
            p.add(s.nextInt());
        int qi = s.nextInt();
        for (int i = 0; i < qi; i++)
            q.add(s.nextInt());
        Set set = new HashSet();
        set.addAll(p);
        set.addAll(q);
        if (set.size() != n)
            System.out.println("Oh, my keyboard!");
        else
            System.out.println("I become the guy.");
    }
}

