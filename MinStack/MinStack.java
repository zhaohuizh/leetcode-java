import java.util.*;

public class MinStack{
  Stack<Integer> stack = new Stack<Integer>();
  Stack<Integer> minStack = new Stack<Integer>();

  public void push(int x){
    if(minStack.isEmpty() || x <= getMin()){
      minStack.push(x);
    }
    stack.push(x);
  }

  public void pop(){
    if(getMin() == top()){
      minStack.pop();
    }
    stack.pop();
  }

  public int top(){
    return stack.peek();
  }

  public int getMin(){
    return minStack.peek();
  }
}
