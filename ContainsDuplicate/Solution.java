import java.util.*;

public class Solution {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<Integer>();
    for(int num : nums){
      if(set.contains(num)){
        return true;
      }else{
        set.add(num);
      }
    }
    return false;
  }
}
