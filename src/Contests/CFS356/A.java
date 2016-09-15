import java.util.*;

public class A {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> list = new ArrayList<Integer>();
    private static int sum;
    private static int counter;

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);

        counter = 0;
        int cache1 = 0;
        int cache2 = 0;
        int cache3 = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1) == list.get(i)) {
                counter++;
                cache1 = i-1;
                cache2 = i;
                if (list.get(i) == list.get(i-1))
                {
                    counter = 2;
                    cache3 = i+1;
                }
            }
        }
        if (counter >= 1){
            list.remove(cache1);
            list.remove(cache2);
            if (counter == 2)
            {
                list.remove(cache3);
            }
        }
        sum = 0;
        for (int i = 0; i < (list.size()); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}	