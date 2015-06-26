import java.util.List;
import java.util.ArrayList;
public class Solution {
  public List<List<String>> solveNQueens(int n) {
    List<List<String>> ret = new ArrayList<List<String>>();
    boolean[][] cache = new boolean[n][n]; 
    helper(n, 0, ret, cache);
    return ret;
  }

  private List<String> generateRet(boolean[][] cache){
    List<String> ret = new ArrayList<String>();
    for(boolean[] line : cache){
      String str = new String();
      for(boolean one : line){
        if(one){
          str += 'Q';
        }else{
          str += '.';
        }
      }
      ret.add(str);
    }
    return ret;
  }

  private void helper(int n, int dep, List<List<String>> ret,
      boolean[][] cache){
    if(dep == n){
      List<String> list = generateRet(cache);
      ret.add(list);
    }else{
      for(int i = 0; i < n; i++){
        if(possible(cache, dep, i)){
          cache[dep][i] = true;
          helper(n, dep + 1, ret, cache);
          cache[dep][i] = false;
        }
      }
    }
  }

  private boolean possible(boolean[][] cache, int i, int j){
    for(int k = 0; k < i; k++){
      if(cache[k][j]){
        return false;
      }
    }
    int m = 1;
    while(i - m >= 0 && j - m >= 0){
      if(cache[i - m][j - m]){
        return false;
      }
      m++;
    }
    m = 1;
    while(i - m >= 0 && j + m < cache.length){
      if(cache[i - m][j + m]){
        return false;
      }
      m++;
    }
    return true;
  }

  public static void main(String[] args){
    Solution s = new Solution();
    List<List<String>> ret = s.solveNQueens(4);
    for(List<String> one : ret){
      for(String str : one){
        System.out.println(str);
      }
      System.out.println();
    }
  }
}
