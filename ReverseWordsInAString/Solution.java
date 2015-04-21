public class Solution {
  public String reverseWords(String s) {
    int len = s.length();
    if(len == 0){
      return s;
    }
    StringBuilder sb = new StringBuilder();
    int i = 0;

    while(i < len && s.charAt(i) == ' '){
      i++;
    }
    int start = -1;
    while(i < len){
      if(s.charAt(i) != ' ' && start < 0){
        start = i;
      }else if(s.charAt(i) == ' ' && start >= 0){
        sb.insert(0, s.substring(start, i));
        sb.insert(0, ' ');
        start = -1;
      }
      i++;
    }
    if(start >= 0 && s.charAt(len - 1) != ' '){
      sb.insert(0, s.substring(start, len));
    }
    if(sb.length() > 0 && sb.charAt(0) == ' '){
      sb.delete(0, 1);
    }
    return sb.toString();
  }

  public static void main(String[] args){
    Solution sl = new Solution();
    String s = "hello";
    System.out.println(sl.reverseWords(s));
    s = "  hello . tem";
    System.out.println(sl.reverseWords(s));
    s = "  ";
    System.out.println(sl.reverseWords(s));

  }
}
