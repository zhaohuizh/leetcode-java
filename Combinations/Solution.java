import java.util.*;

public class Solution {
  public List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> ret = new ArrayList<List<Integer>>();
    List<Integer> curr = new ArrayList<Integer>();
    helper(n, k, 1, curr, ret);
    return ret;
  }

  private void helper(int n, int k, int idx, List<Integer> curr, List<List<Integer>> ret){
    if(curr.size() == k){
      ret.add(new ArrayList<Integer>(curr));
      return;
    }
    for(int i = idx; i <= n; i++){
      curr.add(i);
      helper(n, k, i + 1, curr, ret);
      curr.remove(curr.size() - 1);
    }
  }
}
