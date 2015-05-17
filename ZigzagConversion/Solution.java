public class Solution {
  public String convert(String s, int numRows) {
    int len = s.length();
    if(len <= numRows || numRows == 1) return s;
    int zigSize = numRows * 2 - 2;
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i < numRows; i++){
      for(int j = i; j < len; j = j + zigSize){
        sb.append(s.charAt(j));
        int nextIdx = j + zigSize - 2 * i;
        if(nextIdx < len && nextIdx != j && nextIdx != j + zigSize){
          sb.append(s.charAt(nextIdx));
        }   
      }   
    }
    return sb.toString();
  }
}
