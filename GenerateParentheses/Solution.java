import java.util.*;

public class Solution {
  public List<String> generateParenthesis(int n) { 
    List<String> ret = new ArrayList<String>();
    if(n <= 0){
      return ret;
    }
    helper(ret, new String(), n, n);
    return ret;
  }

  private void helper(List<String> ret, String str, int left, int right){
    if(left == 0 && right == 0){
      ret.add(str);
      return;
    }
    if(left == right){
      helper(ret, str + "(", left - 1, right);
    }else if(left == 0){
      helper(ret, str + ")", left, right - 1);
    }else{
      helper(ret, str + "(", left - 1, right);
      helper(ret, str + ")", left, right - 1);
    }
  }
}
