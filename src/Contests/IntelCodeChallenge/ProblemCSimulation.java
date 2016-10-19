/**
 * Attempted O(n) iteration based solution for http://codeforces.com/problemset/problem/724/C
 * Currently only works on cases where n = m (the grid is a square)
 */

import java.util.*;

public class ProblemCSimulation {
	// used to determine direction of movement of the ray
	static int xdir = 1, ydir = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		Point[] sensors = new Point[k];
		for (int i = 0; i < k; i++) {
			// input loop for sensors
			sensors[i] = new Point(sc.nextInt(), sc.nextInt());
		}
		HashMap<Point, Integer> rays = new HashMap();
		Point start = new Point(0, 0);
		// Setting the start of the ray, calculating the first successor
		Point next = start;
		int index = 1;
		rays.put(next, index);
		// Adding index point pair to hashmap
		Point current = start;
		// Main loop, breaks when the next x and y coordinates are -1
		while ((next.x != -1 && next.y != -1)) {
			// Main loop
			// Calculate the next point
			next = next(current, n, m);
			// Adding it to hashmap
			if (!rays.containsKey(next))
				rays.put(next, index);
			// increment index
			index++;
			// change the current node to the next, recalculate next again
			current = next;
			// System.out.println(current.toString() + " " + next.toString());
			// //debugging statement to see behaviour
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sensors.length; i++) {
			if (!rays.containsKey(sensors[i])) {
				sb.append(-1).append('\n');
			} else {
				sb.append(rays.get(sensors[i])).append('\n');
			}
		}
		System.out.println(sb.toString());

	}

	// O(N) method to grab a key from a hashmap, given a value
	// Intended to optimize this (probably via changing the data structure used)
	// once I passed samples
	public static Point next(Point current, int n, int m) {
		// next method is the core of the program
		Point next = new Point(current.x + xdir, current.y + ydir);
		// when it hits an x bound, make it so that the y vector is now -1 *
		// itself, changing dir
		if (next.x == n || next.x == 0) {
			xdir *= -1;
			// next.x = (current.x - 2);
		}
		// similar behaviour with y bounds
		if (next.y == m || next.y == 0) {
			ydir *= -1;
			// next.y = (current.y - 2);
		}
		// if you're at one of the corners, return -1 for both, which kills
		// the program in the main loop
		// up above
		if ((next.x == n && next.y == m) || (next.x == 0 && next.y == 0) || (next.x == 0 && next.y == m)
				|| next.x == n && next.y == 0) {
			next.x = -1;
			next.y = -1;
		}
		return next;
	}
	static class Point {
		// point class to help make sense of data
		private int x, y;

		Point(int _x, int _y) {
			this.x = _x;
			this.y = _y;
		}



		/**
		 * IntelliJ made this and it makes my life easier
		 */
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