public class Solution {
  public boolean isPalindrome(int x) {
    int tmp = 0;
    if(x != 0 && x % 10 == 0){
      return false;
    }
    while(tmp < x){
      tmp = 10 * tmp + (x % 10);
      x /= 10;
    }
    if(tmp == x || tmp / 10 == x){
      return true;
    }
    return false;
  }
}
