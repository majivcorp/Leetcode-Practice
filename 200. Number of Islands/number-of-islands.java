class Solution {
    public int numIslands(char[][] grid) {
        //1. We start with a count of zero islands.
        int count = 0;
        //2. We loop through the grid.
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //3. If we find a ‘1’, we call dfs to mark all the connected ‘1’s in the same island.
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;//4. We increment the count by one.
                }
            }
        }
        return count;//5. Finally, we return the count.

    }

    public void dfs(char[][] grid, int i, int j) {
        //1. We first check if the current cell is valid or not. If it is not valid, we return from the function.
        if ( i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        //2. If the current cell is valid, we mark the current cell as visited by making it equal to 0.
        grid[i][j] = '0';
        //3. Then, we traverse in all four directions from the current cell and call the dfs function on each valid cell.
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
    }
}