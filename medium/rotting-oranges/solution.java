class Solution {

    public static int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        // Step 1: find all rotten oranges and count fresh
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }

                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int minutes = 0;

        int[][] directions = {
                {1,0}, {-1,0}, {0,1}, {0,-1}
        };

        // Step 2: BFS
        while (!queue.isEmpty() && fresh > 0) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int[] cell = queue.poll();
                int x = cell[0];
                int y = cell[1];

                for (int[] dir : directions) {

                    int nx = x + dir[0];
                    int ny = y + dir[1];

                    if (nx >= 0 && nx < rows && ny >= 0 && ny < cols
                            && grid[nx][ny] == 1) {

                        grid[nx][ny] = 2;
                        fresh--;
                        queue.offer(new int[]{nx, ny});
                    }
                }
            }

            minutes++;
        }

        return fresh == 0 ? minutes : -1;
    }
}