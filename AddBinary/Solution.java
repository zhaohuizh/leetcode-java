public class Solution {
  public String addBinary(String a, String b) {
    StringBuilder sb = new StringBuilder();
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;
    while(i >= 0 || j >= 0){
      int val = carry;
      if(i >= 0){
        val += a.charAt(i--) - '0';
      }
      if(j >= 0){
        val += b.charAt(j--) - '0';
      }
      carry = val / 2;
      val = val % 2;
      sb.insert(0, val);
    }
    if(carry == 1){
      sb.insert(0, 1);
    }
    return sb.toString();
  }
}
