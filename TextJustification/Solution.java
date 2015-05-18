import java.util.*;

public class Solution {
  public List<String> fullJustify(String[] words, int maxWidth) {
      
  }
  
  public String justify(List<String> words, int numSpaces){
    int num = words.size();
    StringBuilder sb = new StringBuilder();
    if(num == 1){
      sb.append(words.get(0));
      while(numSpaces > 0){
        sb.append(" ");
        numSpaces--;
      }
    }else{

    }
    return sb.toString();
  }
}
