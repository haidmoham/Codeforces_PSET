package Contests.CFS355;

/**
 * Created by mo on 9/14/16.
 */

import java.util.*;

public class P355A {
    private static int roadWidth;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        int height = sc.nextInt();
        List<Integer> heights = new ArrayList<Integer>();
        for (int i = 0; i < friends; i++)
        {
            heights.add(sc.nextInt());
        }
        roadWidth = friends;

        sc.close();
        for (int i = 0; i < heights.size(); i++) {
            if (heights.get(i) > height)
                roadWidth++;
        }
        System.out.println(roadWidth);
        System.out.println(Math.pow(3, 3-1));
    }
}
