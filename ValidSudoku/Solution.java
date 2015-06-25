import java.util.Set;
import java.util.HashSet;
public class Solution {
  public boolean isValidSudoku(char[][] board) {
    for(int i = 0; i < 9; i++){
      Set<Character> colSet = new HashSet<Character>();
      Set<Character> rowSet = new HashSet<Character>();
      Set<Character> cubSet = new HashSet<Character>();
      for(int j = 0; j < 9; j++){
        if(board[i][j] != '.'){
          boolean ret = rowSet.add(board[i][j]);
          if(!ret) return false;
        }
        if(board[j][i] != '.'){
          boolean ret = colSet.add(board[j][i]);
          if(!ret) return false;
        }
        if(board[3 * (i % 3) + j % 3][3 * (i / 3) + j / 3] != '.'){
          boolean ret = cubSet.add(board[3 * (i % 3) + j % 3][3 * (i / 3) + j / 3]);
          if(!ret) return false;
        }
      }
      
    }
    return true;
  }
}
