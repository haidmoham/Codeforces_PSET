package B; /**
 * Created by mohammad on 8/23/16.
 */
import java.util.*;
import java.lang.*;


public class Problem113B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String sb = sc.next();
        String se = sc.next();
        ArrayList x = new ArrayList();
        ArrayList y = new ArrayList();

        for (int i = 0; i < t.length(); i++){
            if (sb.length() + i <= t.length() && t.substring(i, sb.length() + i).equals(sb)) x.add(i);
            if (se.length() + i <= t.length() && t.substring(i, se.length() + i).equals(se)) y.add(i);
        }

        int a[][] = new int[t.length()][t.length()];
        for (int i = 0; i < t.length(); i++)
            for (int j = 0; j < t.length(); j++)
                a[i][j] = -1;
        int c[] = new int[t.length()];
        for (int i = 0; i < x.size(); i++){
            for (int j = 0; j < y.size(); j++){
                if ((int) y.get(j) >= (int) x.get(i)
                        && (int) y.get(j) + se.length() - 1  >= (int) x.get(i) + sb.length()-1) {
                    a[(int) y.get(j) - (int) x.get(i)][c[(int) y.get(j) - (int) x.get(i)]] = (int) x.get(i);
                    c[(int) y.get(j) - (int) x.get(i)]++;
                }
            }
        }
        Set<Long> hash = new HashSet<>();
        int ans = 0;
        char[] cc = t.toCharArray();
        long p1 = 31;
        long p2 = (int) 1e9 + 7;
        for (int i = 0; i < t.length(); i++){
            int c1 = 0;
            long h = 0;
            long ph = 1;
            for (int k = 0; k <= i; k++){
                h = (h * p1 + cc[k]) % p2;
                if (k != 0)
                    ph = (ph * p1) % p2;
            }
            hash.clear();
            h %= p2;
            if (a[i][c1] == 0){
                hash.add(h);
                c1++;
            }
            for (int j = 1; j < t.length() - i; j++){
                h = (h - (cc[j-1] * ph) % p2 + p2) * p1 + cc[j+i];
                h %= p2;
                if (a[i][c1] == j){
                    hash.add(h);
                    c1++;
                }
            }
            ans += hash.size();
        }
        System.out.println(ans);
    }

}
