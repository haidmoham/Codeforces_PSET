/**
 * Created by mohammad on 7/25/16.
 */
import java.util.*;

public class Problem514A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[] A = s.next().toCharArray();
        for (int i = 0; i < A.length; i++){
            if (A[i] > '4') A[i] = (char) ('9' - A[i] + '0');
        }
        if (A[0] == '0') A[0] = '9';
        System.out.println(A);
    }
}

