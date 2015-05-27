import java.util.*;
public class Solution {
  public boolean isHappy(int n) {
    Set<Integer> set = new HashSet<Integer>();
    while(true){
      if(n == 1){
        return true;
      }
      if(set.contains(n)){
        return false;
      }
      set.add(n);
      n = getNext(n);
    }
  }

  private int getNext(int n){
    int res = 0;
    while(n != 0){
      int reminder = n % 10;
      res += reminder * reminder;
      n = n / 10;
    }
    return res;
  }
}
