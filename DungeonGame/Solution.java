public class Solution {
  public int calculateMinimumHP(int[][] dungeon){
    if(dungeon.length == 0 || dungeon[0].length == 0){
      return -1;
    }
    int row = dungeon.length;
    int col = dungeon[0].length;
    int[][] res = new int[row][col];
    for(int i = row - 1; i >= 0; i--){
      for(int j = col - 1; j >= 0; j--){
        int tmp = 0;
        if(i == row - 1 && j == col - 1){
          tmp = 1;
        }else if(i == row - 1){
          tmp = res[i][j + 1];
        }else if(j == col - 1){
          tmp = res[i + 1][j];
        }else{
          tmp = Math.min(res[i + 1][j], res[i][j + 1]);
        }
        if(dungeon[i][j] >= tmp){
          res[i][j] = 1;
        }else{
          res[i][j] = tmp - dungeon[i][j];
        }
      }
    }
    return res[0][0];
  }
  public static void main(String[] args){
    int[][] dungeon = {{0, 0}};
    System.out.println(dungeon.length);
    System.out.println(dungeon[0].length);
    Solution s = new Solution();
    int ret = s.calculateMinimumHP(dungeon);
  }
}
