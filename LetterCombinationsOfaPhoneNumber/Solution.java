import java.util.*;
public class Solution {
  private String[] letters = {" ", "", "abc", "edf", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
  public List<String> letterCombinations(String digits) {
    List<String> res = new ArrayList<String>();
    if(digits == null || digits.length() == 0) return res;
    char[] cache = new char[digits.length()];
    helper(digits, cache, res, 0);
    return res;
  }
  private void helper(String digits, char[] cache, List<String> res, int idx){
    if(idx == digits.length()){
      res.add(new String(cache));
      return;
    }
    String letter = letters[digits.charAt(idx) - '0'];
    for(int i = 0; i < letter.length(); i++){
      cache[idx] = letter.charAt(i);
      helper(digits, cache, res, idx + 1);
    }
  } 
}
