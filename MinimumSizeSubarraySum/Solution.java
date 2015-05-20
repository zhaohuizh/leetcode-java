public class Solution {
  public int minSubArrayLen(int s, int[] nums) {
    int b = 0;
    int e = 0;
    int res = 0;
    int sum = 0;
    while(e <= nums.length){
      if(sum >= s){
        if(res == 0){
          res = e - b;
        }else{
          res = Math.min(res, e - b);
        }
        sum -= nums[b];
        b++;
      }else{
        if(e == nums.length) break;
        sum += nums[e];
        e++;
      }
    }
    return res;
  }

  public static void main(String[] args){
    int[] nums = {1};
    Solution s = new Solution();
    int res = s.minSubArrayLen(4, nums);
    System.out.println(res);
  }
}
