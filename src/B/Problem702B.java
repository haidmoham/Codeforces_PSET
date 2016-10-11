package B; /**
 * Created by mohammad on 8/26/16.
 */
import java.util.*;
public class Problem702B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] in = new long[n];
        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++){
            long input = sc.nextLong();
            in[i] = input;
            if (map.containsKey(input)){
                long counter = map.get(input) + 1;
                map.put(input, counter);
            }
            else {
                map.put(input, 1l);
            }
        }
        long[] powers = new long[31];
        long mask = 1; int index = 0;
        while (mask <= Integer.MAX_VALUE){
            powers[index] = mask;
            index++;
            mask <<= 1;
        }
        long soln = 0;
        for (int i = 0; i < n; i++){
            long key = in[i];
            long mult = map.get(key);
            for (int j = 0; j < 31; j++){
                if (powers[j] > key){
                    long x = powers[j] - key;
                    if (x == key) soln += mult - 1;
                    else {
                        if (map.containsKey(x))  soln += map.get(x);
                    }
                }
            }
            long value = map.get(key) - 1;
            map.put(key, value);
        }
        System.out.println(soln);
    }
}
