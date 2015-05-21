import java.util.*;

public class Solution {
  public int[] twoSum(int[] nums, int target) {
    int[] res = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0; i < nums.length; i++){
      int diff = target - nums[i];
      if(map.containsKey(diff)){
        res[0] = map.get(diff) + 1;
        res[1] = i + 1;
        return res;
      }else{
        map.put(nums[i], i);
      }
    }
    return res;
  }
}
