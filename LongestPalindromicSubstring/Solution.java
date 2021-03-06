public class Solution {
  public String longestPalindrome(String s) {
    String res = "";
    for(int i = 0; i < s.length() - 1; i++){
      String tmp;
      if(s.charAt(i) == s.charAt(i + 1)){
        tmp = getLongestPalindrome(s, i, i + 1);
        if(tmp.length() > res.length()){
          res = tmp;
        }
      }
      tmp = getLongestPalindrome(s, i, i);
      if(tmp.length() > res.length()){
        res = tmp;
      }
    }
    return res;
  }
  
  private String getLongestPalindrome(String s, int start, int end){
    while(start >= 0 && end < s.length()){
      if(s.charAt(start) == s.charAt(end)){
        start--;
        end++;
      }else{
        break;
      }
    }
    return s.substring(start + 1, end);
  }
}
