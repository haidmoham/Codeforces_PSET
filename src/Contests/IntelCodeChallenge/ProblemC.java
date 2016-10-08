import java.util.*;

public class ProblemC {
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		Point[] sensors = new Point[k];
		for (int i = 0; i < k; i++){
			sensors[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		HashMap<Integer, Point> rays = new HashMap();
		Point start = new Point(0, 0);
		Point next = start.next(start, n, m);
		int index = 1;
		rays.put(index, next);
		Point current = start;
		while((next.x != -1 && next.y != -1)) {
			next = Point.next(current, n, m);
			rays.put(index, next);
			index++;
			current = next;
			System.out.println(current.toString() + " " + next.toString());
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sensors.length; i++) {
			if (!rays.containsValue(sensors[i])) {
				sb.append(-1).append('\n');
			}
			else {
				sb.append(getKeyFromValue(rays, sensors[i])).append('\n');
			}
		}
		System.out.println(sb.toString());
		
	}
	 public static Object getKeyFromValue(Map hm, Object value) {
		    for (Object o : hm.keySet()) {
		      if (hm.get(o).equals(value)) {
		        return o;
		      }
		    }
		    return null;
  }	
	static class Point {
		private int x, y;
		Point (int _x, int _y) {
			this.x = _x;
			this.y = _y;
		}
		public static Point next(Point current, int n, int m){
			double dir = Math.sqrt(2);
			double angle = Math.tan(dir);
			Point next = new Point( (int) (current.x + (1 * dir)),(int)  (current.y + (1*dir)));
			if (next.x > n) {
				dir *= -1;
				next.x = (int) (current.x + (1 * (dir * Math.cos(angle))));
			}
			if (next.y > m) {
				dir *= -1;
				next.y = (int) (current.y + (1 * (dir * Math.cos(angle))));
			}
			if ((next.x == n && next.y == m) || (next.x == 0 && next.y == 0) || (next.x == 0 && next.y == m) || 
					next.x == n && next.y == 0){
				next.x = -1;
				next.y = -1;
			}
			return next;
		}
		@Override
		public String toString() {
			return "Point [x=" + x + ", y=" + y + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + x;
			result = prime * result + y;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Point other = (Point) obj;
			if (x != other.x)
				return false;
			if (y != other.y)
				return false;
			return true;
		}
		 
	}
}
