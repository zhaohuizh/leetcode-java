public class Solution {
  public int numIslands(char[][] grid) {
    int num = 0;
    for(int i = 0; i < grid.length; i++){
      for(int j = 0; j < grid[0].length; j++){
        if(grid[i][j] == '1'){
          num++;
          traverse(grid, i, j);
        }
      }
    }
    return num;
  }
  private void traverse(char[][] grid, int i, int j){
    if(i >= 0 && i < grid.length &&
       j >= 0 && j < grid[0].length &&
       grid[i][j] == '1'){
      grid[i][j] = '0';
      traverse(grid, i - 1, j);
      traverse(grid, i + 1, j);
      traverse(grid, i, j + 1);
      traverse(grid, i, j - 1);
    }
  }

  public static void main(String[] args){
    Solution s = new Solution();
    char[][] grid = {{'1', '1', '1', '0'}, {'1', '0', '0', '1'}};
    int num = s.numIslands(grid);
    System.out.println(num);
  }
}
