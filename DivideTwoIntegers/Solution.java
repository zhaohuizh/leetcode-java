public class Solution {
  public int divide(int dividend, int divisor) {
    if(divisor == 0){
      return Integer.MAX_VALUE;
    }
    boolean negative = dividend < 0;
    negative ^= divisor < 0;
    dividend = Math.abs(dividend);
    divisor = Math.abs(divisor);
    int ret = 0;
    while(dividend > 0){
      dividend -= divisor;
      ret++;
    }
    if(negative){
      ret = 0 - ret;
    }
    return ret;
  }
}
