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
      if(val == 0){
        sb.insert(0, 0);
        carry = 0;
      }else if(val == 1){
        sb.insert(0, 1);
        carry = 0;
      }else if(val == 2){
        sb.insert(0, 0);
        carry = 1;
      }else{
        sb.insert(0, 1);
        carry = 1;
      }
    }
    if(carry == 1){
      sb.insert(0, 1);
    }
    return sb.toString();
  }
}
