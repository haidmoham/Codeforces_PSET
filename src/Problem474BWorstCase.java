/**
 * Created by mohammad on 8/28/16.
 */
public class Problem474BWorstCase {
    public static void main(String[] args){
        int n = 100000;
        System.out.println(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++){
            sb.append(1);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
