import java.util.Set;
import java.util.HashSet;

public class Solution{
  public int ladderLength(String start, String end, Set<String> dict){
    Set<String> begin = new HashSet<String>();
    int depth = 1;
    int len = start.length();
    begin.add(start);
    while(begin.isEmpty()){
      for(String str : begin){
        for(int i = 0; i < len; i++){
          for(int j = 0; j < 26; j++){
            char c = 'a' + j;
            String newStr = str.substring(0, i) + c + str.substring(i + 1);
          }
        }
        
      }
    }
  }
}
