package B; /**
 * Created by mohammad on 7/25/16.
 */
import java.util.*;

public class Problem200B {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] drinks = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++){
            drinks[i] = s.nextDouble();
            sum += drinks[i];
        }
        double total = n * 100;
        double orange = (sum / total) * 100;
        System.out.println(orange);
    }
}
