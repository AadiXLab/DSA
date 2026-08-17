import java.util.*;

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        if (grid[0][0] != 0 || grid[m - 1][n - 1] != 0) {
            return -1;
        }

        Queue<int[]> q = new LinkedList<>();

        // {row, column, distance}
        q.add(new int[]{0, 0, 1});

        // Mark visited
        grid[0][0] = 1;

        int[][] dir = {
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0},
            {1, 1},
            {1, -1},
            {-1, 1},
            {-1, -1}
        };

        while (!q.isEmpty()) {

            int[] point = q.poll();

            int row = point[0];
            int col = point[1];
            int distance = point[2];

            // Destination reached
            if (row == m - 1 && col == n - 1) {
                return distance;
            }

            // Explore 8 directions
            for (int[] d : dir) {

                int r = row + d[0];
                int c = col + d[1];

                if (r >= 0 && r < m &&
                    c >= 0 && c < n &&
                    grid[r][c] == 0) {

                    // Mark visited
                    grid[r][c] = 1;

                    // Add next cell with distance + 1
                    q.add(new int[]{r, c, distance + 1});
                }
            }
        }

        return -1;
    }
}