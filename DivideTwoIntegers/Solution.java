public class Solution {
  public int divide(int dividend, int divisor) {
    if(divisor == 0){
      return Integer.MAX_VALUE;
    }
    if(divisor==-1 && dividend == Integer.MIN_VALUE){
      return Integer.MAX_VALUE;
    }
    boolean negative = dividend < 0;
    negative ^= divisor < 0;
    long dividendLong = Math.abs((long)dividend);
    long divisorLong = Math.abs((long)divisor);
    int ret = 0;
    while(dividendLong > divisorLong){
      int shif = 0;
      while(dividendLong > (divisorLong << shif)){
        shif++;
      }
      ret += 1 << (shif - 1);
      dividendLong -= divisorLong << (shif - 1);
    }
    if(negative){
      ret = 0 - ret;
    }
    return ret;
  }

  public static void main(String[] args){
    boolean a = -1 < 0;
    a ^= -2 < 0;
    System.out.println(a);
  }
}
