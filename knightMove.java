import java.util.*;

public class Contest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] directions = {
            {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
        };

        int[][] a = new int[n][n];
        for (int[] row : a) Arrays.fill(row, -1);

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});
        a[0][0] = 0;

        while (!q.isEmpty()) {
            int[] pos = q.poll();
            int x = pos[0], y = pos[1];

            for (int[] dir : directions) {
                int nx = x + dir[0], ny = y + dir[1];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && a[nx][ny] == -1) {
                    a[nx][ny] = a[x][y] + 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }

        // Output to console
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
