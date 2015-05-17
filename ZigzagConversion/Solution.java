public class Solution {
  public String convert(String s, int numRows) {
    int len = s.length();
    if(len <= numRows || numRows == 1) return s;
    int zigSize = numRows * 2 - 2;
    StringBuilder sb = new StringBuilder();
    for(int j = 0; j < len; j = j + zigSize){
      sb.append(s.charAt(j));
    }   
    for(int i = 1; i < numRows - 1; i++){
      for(int j = i; j < len; j = j + zigSize){
        sb.append(s.charAt(j));
        int nextIdx = j + zigSize - 2 * i;
        if(nextIdx < len){
          sb.append(s.charAt(nextIdx));
        }   
      }   
    }   
    for(int j = numRows - 1; j < len; j = j + zigSize){
      sb.append(s.charAt(j));
    }   
    return sb.toString();
  }
}
