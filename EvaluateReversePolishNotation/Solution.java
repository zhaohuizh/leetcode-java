public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<Integer>();
        for(String token : tokens){
            if(isOperator(token)){
                int val2 = s.pop();
                int val1 = s.pop();
                int ret = getResult(val1, val2, token);
                s.push(ret);
            }else{
                s.push(Integer.parseInt(token));
            }
        }
        return s.peek();
    }
    
    private boolean isOperator(String str){
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
    
    private int getResult(int val1, int val2, String token){
        switch(token){
            case "+":
                return val1 + val2;
            case "-":
                return val1 - val2;
            case "*":
                return val1 * val2;
            default:
                return val1 / val2;
                
         }
    }
}
