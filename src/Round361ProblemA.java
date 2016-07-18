import java.util.Scanner;

/**
 * Created by halmas94 on 7/12/16.
 */
public class Round361ProblemA {
  static int[][] positions = {
      {3, 1},
      {0, 0},
      {0, 1},
      {0, 2},
      {1, 0},
      {1, 1},
      {1, 2},
      {2, 0},
      {2, 1},
      {2, 2}
  };

  static int[][] grid = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9},
      {-1, 0, -1}
  };

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    String num = scan.next();
    int[] digits = new int[N];
    for (int i = 0; i < N; i++) {
      digits[i] = Integer.parseInt("" + num.charAt(i));
    }
    int[][] vectors = new int[N - 1][2];
    for (int i = 0; i < N - 1; i++) {
      int r1 = positions[digits[i]][0];
      int c1 = positions[digits[i]][1];

      int r2 = positions[digits[i + 1]][0];
      int c2 = positions[digits[i + 1]][1];

      vectors[i][0] = r2 - r1;
      vectors[i][1] = c2 - c1;
    }

    int possible = 0;
    for (int r = 0; r < 4; r++) {
      out:
      for (int c = 0; c < 3; c++) {
        if (grid[r][c] != -1) {
          int tR = r;
          int tC = c;
          for (int i = 0; i < N - 1; i++) {
            tR += vectors[i][0];
            tC += vectors[i][1];
            if (!isValid(tR, tC)) {
              continue out;
            }
          }
          possible++;
        }
      }
    }

    System.out.println(possible > 1 ? "NO" : "YES");
  }

  public static boolean isValid(int r, int c) {
    return r >= 0 && r < 4 && c >= 0 && c < 3 && grid[r][c] != -1;
  }
}
