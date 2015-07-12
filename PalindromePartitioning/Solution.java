import java.util.*;

public class Solution {
  private boolean isPalindrome(String s, int b, int e){
    while(b < e - 1){
      if(s.charAt(b) != s.charAt(e - 1)){
        return false;
      }
      b++;
      e--;
    }
    return true;
  }

  private void helper(String s, List<List<String>> ret,
      List<String> part, int idx){
    if(idx == s.length()){
      ret.add(new ArrayList<String>(part));
      return;
    }
    for(int i = idx + 1; i <= s.length(); i++){
      if(isPalindrome(s, idx, i)){
        part.add(s.substring(idx, i));
        helper(s, ret, part, i);
        part.remove(part.size() - 1);
      }
    }
  }

  public List<List<String>> partition(String s) {
    List<List<String>> ret = new ArrayList<List<String>>();
    List<String> partition = new ArrayList<String>();
    helper(s, ret, partition, 0);
    return ret;
  }
}
