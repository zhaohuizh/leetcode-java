public class Solution {
  public int removeDuplicates(int[] nums) {
    int ret = 0;
    if(nums.length == 0) return ret;
    ret = 1;
    int idx = 1;
    for(int i = 1; i < nums.length; i++){
      if(nums[i] != nums[i - 1]){
        nums[idx++] = nums[i];
        ret++;
      }
    }
    return ret;
  }
}
