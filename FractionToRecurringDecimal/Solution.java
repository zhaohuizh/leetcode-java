import java.util.*;

public class Solution{
  public String fractionToDecimal(int numerator, int denominator){
    if(numerator == 0) return "0";
    StringBuilder sb = new StringBuilder();
    if((numerator < 0) != (denominator < 0)){
      sb.append("-");
    }
    long num = Math.abs((long) numerator);
    long den = Math.abs((long) denominator);
    sb.append(num / den);
    long remainder = num % den;
    if(remainder == 0){
      return sb.toString();
    }
    sb.append(".");
    Map<Long, Integer> map = new HashMap<Long, Integer>();
    while(remainder != 0){
      if(map.containsKey(remainder)){
        int index = map.get(remainder);
        sb.insert(index, "(");
        sb.append(")");
        break;
      }else{
        map.put(remainder, sb.length());
        sb.append(remainder * 10 / den);
        remainder = remainder * 10 % den;
      }
    }
    return sb.toString();
  }

  public static void main(String[] args){
    int numerator = 1;
    int denominator = 333;
    Solution s = new Solution();
    String res = s.fractionToDecimal(numerator, denominator);
    System.out.println(res);
  }
}
