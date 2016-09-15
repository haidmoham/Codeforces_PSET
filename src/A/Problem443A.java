package A; /**
 * Created by mohammad on 7/27/16.
 */
import java.util.*;
public class Problem443A {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String in = s.nextLine();
        in = in.replace('{',' ');
        in = in.replace('}',' ');
        in = in.replace(',',' ');
        in = in.replaceAll("\\s+","");

        Set resultSet = new HashSet();
        for (int i = 0; i < in.length(); i++){
            resultSet.add(new Character(in.charAt(i)));
        }
        System.out.println(resultSet.size());
    }
}
