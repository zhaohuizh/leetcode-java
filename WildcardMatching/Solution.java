public class Solution {
  public boolean isMatch(String s, String p) {
    int i = 0;
    int j = 0;
    int star = -1;
    int st = 0;
    while(i < s.length()){
      if(j < p.length() && 
          (p.charAt(j) == '?' || s.charAt(i) == p.charAt(j))){
        i++;
        j++;
      }else if(j < p.length() && p.charAt(j) == '*'){
        star = j ++;
        st = i;
      }else if(star != -1){
        j = star + 1;
        st++;
        i = st;
      }else{
        return false;
      }
    }
    while(j < p.length() && p.charAt(j) == '*'){
      j++;
    }
    return j == p.length();
  }
}
