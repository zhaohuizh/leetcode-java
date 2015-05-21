public class Solution {
  public int rob(int[] nums) {
    int res = 0;
    if(nums == null || nums.length == 0) return res;
    int exclude = 0;
    int include = 0;
    for(int i = 0; i < nums.length; i++){
      int tmp = include;
      include = exclude + nums[i];
      exclude = Math.max(exclude, tmp); 
    }
    return Math.max(include, exclude);
  }
}
