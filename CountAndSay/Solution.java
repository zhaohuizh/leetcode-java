public class Solution{
  public static String next(String str){
    if(str.length() == 0) return str;
    StringBuilder sb = new StringBuilder();
    char curr;
    char prev = str.charAt(0);
    int count = 1;
    for(int i = 1; i < str.length(); i++){
      curr = str.charAt(i);
      if(curr == prev){
        count++;
      }else{
        sb.append(count);
        sb.append(prev);
        prev = curr;
        count = 1;
      }
    }
    sb.append(count);
    sb.append(prev);
    return sb.toString();
  }
  public static String countAndSay(int n){
    String str = "1";
    String newStr = "1";
    for(int i = 1; i < n; i++){
      newStr = next(str);
      str = newStr;
    }
    return newStr;
  }

  public static void main(String[] args){
    String res = countAndSay(8);
    System.out.println(res);
  }
}
