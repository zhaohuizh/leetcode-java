public class Solution {
  public boolean isMatch(String s, String p) {
    return isMatch(s, p, 0, 0);
  }
  
  private boolean isMatch(String s, String p, int idxS, int idxP){
    if(idxS == s.length() && idxP == p.length()){
      return true;
    }
    if(idxP == p.length()){
      return false;
    }
    if(idxP < p.length() - 1 && p.charAt(idxP + 1) == '*'){
      if(idxS < s.length() && (p.charAt(idxP) == '.' || p.charAt(idxP) == s.charAt(idxS))){
        return isMatch(s, p, idxS, idxP + 2) || isMatch(s, p, idxS + 1, idxP);
      }else{
        return isMatch(s, p, idxS, idxP + 2);
      }
    }
    if(idxS < s.length() && (p.charAt(idxP) == '.' || p.charAt(idxP) == s.charAt(idxS))){
      return isMatch(s, p, idxS + 1, idxP + 1);
    }else{
      return false;
    }
  }
}
