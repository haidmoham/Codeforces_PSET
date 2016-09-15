package C; /**
 * Created by mohammad on 7/28/16.
 */
import java.util.*;

public class Problem004C {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++){
            String in = s.next();
            if (!mp.containsKey(in)){
                mp.put(in, 0);
                System.out.println("OK");
            }
            else {
                mp.put(in, mp.get(in) + 1);
                System.out.println(in+mp.get(in));
            }
        }
    }
}
