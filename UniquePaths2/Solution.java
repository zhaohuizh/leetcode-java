public class Solution {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    if(m == 0 || n == 0) return 0;
    int[] cache = new int[n];
    boolean flag = false;
    for(int i = 0; i < n; i++){
      if(flag || obstacleGrid[0][i] == 1){
        cache[i] = 0;
        flag = true;
      }else{
        cache[i] = 1;
      }
    }   
    for(int i = 1; i < m; i++){
      if(obstacleGrid[i][0] == 1){
        cache[0] = 0;
      }
      for(int j = 1; j < n; j++){
        if(obstacleGrid[i][j] == 0){ 
          cache[j] = cache[j - 1] + cache[j];
        }else{
          cache[j] = 0;
        }   
      }   
    }   
    return cache[n - 1]; 
  }
}
