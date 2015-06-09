import java.util.Stack;

public class Solution {

  private boolean isPlusOrMinus(String str){
    return str.equals("+") || str.equals("-");
  }

  public int calculate(String s) {
    Stack<String> stack = new Stack<String>();
    for(int i = 0; i < s.length; i++){
      char c = s.charAt(i);
      if(c == ' '){
        continue;
      }
      if(c == '+' || c == '-'){
        stack.push(String.valueOf(c));
        continue;
      }
      if(!stack.empty() && isPlusOrMinus(stack.peek())){
        String operator = stack.pop();
        int old = Integer.valueOf(stack.pop());
        int res = 0;
        if(operator.equals("+")){
          res = old + Integer.valueOf(c);
        }else{
          res = old - Integer.valueOf(c);
        }
        stack.push(String.valueOf(old));
      }else{
        stack.push(String.valueOf(c));
      }
    }
    return stack.pop();
  }

  public static void main(String[] args){
    String str = "2-1 + 2 ";
    Solution s = new Solution();
    int ret = s.calculate(str);
    System.out.println(ret);
  }
}
