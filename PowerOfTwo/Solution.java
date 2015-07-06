public class Solution {
  public boolean isPowerOfTwo(int n) {
    while(n > 1){
      if((1 & n) != 0){
        return false;
      }
      n >>= 1;
    }
    return n > 0;
  }
}
