import java.util.*;
public class Solution {
  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    permute(nums, res, 0);
    return res;
  }

  private void swape(int[] nums, int i, int j){
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
  
  private void permute(int[] nums,
     List<List<Integer>> res, int start){
    if(start == nums.length){
      List<Integer> copy = new ArrayList<Integer>();
      for(int num : nums){
        copy.add(num);
      }
      res.add(copy);
    }else{
      for(int i = start; i < nums.length; i++){
        swape(nums, start, i);
        permute(nums, res, start + 1);
        swape(nums, start, i);
      }
    }
  }

  public static void main(String[] args){
    int[] nums = new int[]{1, 2, 3};
    Solution s = new Solution();
    List<List<Integer>> res = s.permute(nums);
    for(List<Integer> one : res){
      for(int i : one){
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }
}
