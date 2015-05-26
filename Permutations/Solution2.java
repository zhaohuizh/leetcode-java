import java.util.*;

public class Solution2 {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> sofar = new ArrayList<Integer>();
    permute(nums, res, sofar);
    return res;
  }

  private void permute(int[] nums, List<List<Integer>> res, List<Integer> sofar){
    if(sofar.size() == nums.length){
      List<Integer> tmp = new ArrayList<Integer>(sofar);
      res.add(tmp);
      return;
    }
    for(int i = 0; i < nums.length; i++){
      if(!sofar.contains(nums[i])){
        sofar.add(nums[i]);
        permute(nums, res, sofar);
        sofar.remove(sofar.size() - 1);
      }
    }
  }
}
