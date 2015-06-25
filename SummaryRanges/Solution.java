public class Solution {
  public List<String> summaryRanges(int[] nums) {
    List<String> ret = new LinkedList<String>();
    if(nums.length == 0){
      return ret;
    }
    int begin = nums[0];
    int end = nums[0];
    for(int i = 1; i < nums.length; i++){
      if(nums[i] != end + 1){
        if(begin == end){
          ret.add(String.valueOf(begin));
        }else{
          ret.add(String.valueOf(begin) + "->" + String.valueOf(end));
        }
        begin = nums[i];
      }
      end = nums[i];
    }
    if(begin == end){
      ret.add(String.valueOf(begin));
    }else{
      ret.add(String.valueOf(begin) + "->" + String.valueOf(end));
    }
    return ret;
  }
}
