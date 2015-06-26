public class Solution {
  private int[] ret = new int[2];
  public int[] searchRange(int[] nums, int target) {
    ret[0] = nums.length;
    ret[1] = -1;
    helper(nums, target, 0, nums.length - 1);
    if(ret[0] == nums.length){
      ret[0] = -1;
    }
    return ret;
  }

  private void helper(int[] nums, int target, int begin, int end){
    if(begin <= end){
      int mid = (begin + end) >> 1;
      if(nums[mid] > target){
        helper(nums, target, begin, mid - 1);
      }else if(nums[mid] < target){
        helper(nums, target, mid + 1, end);
      }else{
        ret[0] = Math.min(ret[0], mid);
        ret[1] = Math.max(ret[1], mid);
        helper(nums, target, begin, mid - 1);
        helper(nums, target, mid + 1, end);
      }
    }
  }
}
