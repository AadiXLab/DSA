class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        if (grid[0][0] == 1) {
            return -1;
        }

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        // {row, column, distance}
        q.add(new int[]{0, 0, 1});

        // Mark starting point visited
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

            int size = q.size();

            while (size-- > 0) {

                int[] point = q.poll();

                if (point[0] == m - 1 && point[1] == n - 1) {
                    return point[2];
                }

                for (int[] d : dir) {

                    int r = point[0] + d[0];
                    int c = point[1] + d[1];

                    // Valid and unvisited
                    if (r >= 0 && r < m &&
                        c >= 0 && c < n &&
                        grid[r][c] == 0) {

                        q.add(new int[]{
                            r,
                            c,
                            point[2] + 1
                        });

                        // Mark visited
                        grid[r][c] = 1;
                    }
                }
            }
        }

        return -1;
    }
}