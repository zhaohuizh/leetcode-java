import java.util.*;

public class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> ret = new ArrayList<List<Integer>>();

    Arrays.sort(nums);
    for(int i = 0; i < nums.length - 2; i++){
      if(nums[i] > 0){
        break;
      }
      if(i > 0 && nums[i] == nums[i - 1]){
        continue;
      }
      int j = i + 1;
      int k = nums.length - 1;
      while(j < k){
        int sum = nums[i] + nums[j] + nums[k];
        if(sum == 0){
          List<Integer> one = new ArrayList<Integer>();
          one.add(nums[i]);
          one.add(nums[j]);
          one.add(nums[k]);
          ret.add(one);
          do{
            j++;
          }while(j < k && nums[j] == nums[j - 1]);
          do{
            k--;
          }while(j < k && nums[k] == nums[k + 1]);
        }else if(sum > 0){
          do{
            k--;
          }while(j < k && nums[k] == nums[k + 1]);
        }else{
          do{
            j++;
          }while(j < k && nums[j] == nums[j - 1]);
        }
      }
    }
    return ret;
  }
}
