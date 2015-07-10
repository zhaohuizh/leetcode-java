import java.util.*;

public class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> ret = new ArrayList<List<Integer>>();
    List<Integer> comb = new ArrayList<Integer>();
    helper(candidates, target, 0, comb, ret);
    return ret;
  }

  private void helper(int[] candidates, int target, int idx,
      List<Integer> curr, List<List<Integer>> ret){
    if(target == 0){
      ret.add(new ArrayList<Integer>(curr));
    }else if(target > 0){
      for(int i = idx; i < candidates.length; i++){
        curr.add(candidates[i]);
        helper(candidates, target - candidates[i], i, curr, ret);
        curr.remove(curr.size() - 1);
      }
    }
  }
}
