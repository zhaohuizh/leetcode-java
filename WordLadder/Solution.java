import java.util.Set;
import java.util.HashSet;

public class Solution{
  public static int ladderLength(String start, String end, Set<String> dict){
    Set<String> begin = new HashSet<String>();
    int depth = 1;
    if(start.equals(end)){
      return depth;
    }
    int len = start.length();
    begin.add(start);
    while(!begin.isEmpty()){
      depth++;
      Set<String> newLevel = new HashSet<String>();
      for(String str : begin){
        for(int i = 0; i < len; i++){
          for(char j = 'a'; j <= 'z'; j++){
            String newStr = str.substring(0, i) + j + str.substring(i + 1);
            if(newStr.equals(end)){
              return depth;
            }
            if(dict.contains(newStr)){
              newLevel.add(newStr);
              dict.remove(newStr);
            }
          }
        }
      }
      begin = newLevel;
    }
    return 0;
  }

  public static void main(String[] args){
    Set<String> dict = new HashSet<String>();
    dict.add("a");
    dict.add("b");
    dict.add("c");
    int depth = ladderLength("a", "c", dict);
    System.out.println(depth);
  }
}
