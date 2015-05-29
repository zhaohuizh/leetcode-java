public class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    Set<Integer> set = new HashSet<Integer>();
    int i = 0;
    while(i < k && i < nums.length){
      if(set.contains(nums[i])){
        return true;
      }
      set.add(nums[i]);
      i++;
    }
    while(i < nums.length){
      if(set.contains(nums[i])){
        return true;
      }
      set.add(nums[i]);
      set.remove(nums[i - k]);
      i++;
    }
    return false;
  }
}
