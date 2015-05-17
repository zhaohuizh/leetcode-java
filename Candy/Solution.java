public class Solution {
  public int candy(int[] ratings) {
    int len = ratings.length;
    if(len == 0) return 0;
    int[] num = new int[len];
    num[0] = 1;
    for(int i = 1; i < len; i++){
      if(ratings[i] > ratings[i - 1]){
        num[i] = num[i - 1] + 1;
      }else{
        num[i] = 1;
      }
    }
    int res = num[len - 1];
    for(int i = len - 2; i >= 0; i--){
      if(ratings[i] > ratings[i + 1] && num[i] <= num[i + 1]){
        num[i] = num[i + 1] + 1;
      }
      res += num[i];
    }
    return res;
  }
}
