import java.util.*;

public class Solution {
  public int[] plusOne(int[] digits) {
    List<Integer> list = new ArrayList<Integer>();
    int len = digits.length;
    int add = 1;
    for(int i = len - 1; i >= 0; i--){
      int ret = (digits[i] + add) % 10;
      add = (digits[i] + add) / 10;
      list.add(ret);
    }
    if(add == 1){
      list.add(1);
    }
    int[] res = new int[list.size()];
    for(int i = 0; i < list.size(); i++){
      res[i] = list.get(list.size() - i - 1);
    }
    return res;
  }
  public static void main(String[] args){
    Solution s = new Solution();
    int[] d = {9, 9};
    int[] res = s.plusOne(d);
    System.out.println(Arrays.toString(res));
  }
}
