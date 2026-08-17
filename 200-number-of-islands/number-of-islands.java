class Solution {
    public int numIslands(char[][] grid) {
       
        int count =0;

        if(grid == null || grid.length ==0 || grid[0].length ==0){
            return 0;
        }

        for(int i =0; i<grid.length; i++){
            for(int j =0; j< grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;  
    }
    // this function is used to explaore more land wala cell kyuki woh sb 1 island consider honge
    private void dfs(char[][] grid, int i, int j){
        
        if(i<0 || j<0|| i>=grid.length || j>=grid[0].length ||grid[i][j] == '0'){
            return;
        }
        // mark the cell as visited
        grid[i][j] = '0';

        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        dfs(grid, i-1, j);
        dfs(grid, i+1, j);
    }
}