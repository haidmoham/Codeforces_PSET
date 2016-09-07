/**
 * Created by mo on 9/6/16.
 * Editing by Eric Williamson to try to generate nodes on the fly
 */
import java.util.*;

public class Problem520B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        System.out.println(bfs(n, m));
    }

    static long bfs(int start, int end){
        State startState = new State(0,start);
        Queue<State> queue = new ArrayDeque<>();
        Set<State> visited = new HashSet<>();

        queue.offer(startState);
        visited.add(startState);

        while(!queue.isEmpty()){
            State current = queue.poll();
            if(current.number == end) return current.dist; 
            for (State adj : current.adj(end)){
                if (!visited.contains(adj)){
                    visited.add(adj);
                    queue.offer(adj);
                }
            }
        }
        return -1;
    }
    
    
}
class State{
	long dist, number;
	public State(long dist, long num){
		this.dist = dist;
		this.number = num;
	}
	
	public ArrayList<State> adj(int end){
	  ArrayList<State> s = new ArrayList<>(2);
	  if (this.number < end){
		  s.add(new State(dist + 1, number * 2));
	  }
	  if (this.number > 0){
		  s.add(new State(dist + 1, number - 1));
	  }
	  return s;
	}
	@Override
	public boolean equals(Object o){
		if (o instanceof State){
			State other = (State)o;
			return other.dist == this.dist && other.number == this.number;
		}
		return false;
	}
	@Override
	public int hashCode(){
		return (int) (this.number + this.dist * 1000); 
	}
}
