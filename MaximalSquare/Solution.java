public class Solution {
  public int maximalSquare(char[][] matrix) { 
    if(matrix.length == 0 || matrix[0].length == 0){
      return 0;
    }
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] dp = new int[rows][cols];
    int ret = 0;
    for(int r = 0; r < rows; r++){
      for(int c = 0; c < cols; c++){
        if(r == 0 || c == 0){
          dp[r][c] = matrix[r][c] - '0';
        }else if(matrix[r][c] == '0'){
          dp[r][c] = 0;
        }else{
          int val = Math.min(dp[r - 1][c], dp[r][c - 1]);
          val = Math.min(val, dp[r - 1][c - 1]);
          dp[r][c] = val + 1;
        }
        ret = Math.max(dp[r][c] * dp[r][c], ret);
      }
    }
    return ret;
  }
}
