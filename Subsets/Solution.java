import java.util.*;

public class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> ret = new ArrayList<List<Integer>>();
    for(int i = 0; i < (1 << nums.length); i++){
      List<Integer> sub = new ArrayList<Integer>();
      for(int j = 0; j < nums.length; j++){
        if(((i >> j) & 1) == 1){
          sub.add(nums[j]);
        }
      }
      ret.add(sub);
    }
    return ret;
  }
}
