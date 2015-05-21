public class Solution {
  public int rob(int[] nums) {
    if(nums == null || nums.length == 0) return 0;
    if(nums.length == 1) return nums[0];
    return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
  }
  public int rob(int[] nums, int low, int hi){
    if(low == hi) return nums[low];
    int exclude = 0;
    int include = 0;
    for(int i = low; i <= hi; i++){
      int tmp = include;
      include = exclude + nums[i];
      exclude = Math.max(tmp, exclude);
    }
    return Math.max(include, exclude);
  }
}
