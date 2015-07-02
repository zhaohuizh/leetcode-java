import java.util.*;

public class Solution {
  public List<String> fullJustify(String[] words, int maxWidth) {
    List<String> ret = new ArrayList<String>();
    List<String> line = new ArrayList<String>();
    int len = 0;
    for(int i = 0; i < words.length; i++){
      line.add(words[i]);
      len += words[i].length() + 1;
      if(i < words.length - 1
          && len + words[i + 1].length() > maxWidth){
        ret.add(justify(line, maxWidth));
        line.clear();
        len = 0;
      }
    }
    if(line.size() > 0){
      StringBuilder sb = new StringBuilder();
      sb.append(line.get(0));
      for(int i = 1; i < line.size(); i++){
        sb.append(" ");
        sb.append(line.get(i));
      }
      int l = sb.length();
      for(int j = 0; j < maxWidth - l; j++){
        sb.append(" ");
      }
      ret.add(sb.toString());
    }
    return ret;
  }
  
  public String justify(List<String> words, int maxWidth){
    int len = 0;
    for(String wd: words){
      len += wd.length();
    }
    int numSpaces = maxWidth - len;
    int num = words.size();
    StringBuilder sb = new StringBuilder();
    if(num == 1){
      sb.append(words.get(0));
      while(numSpaces > 0){
        sb.append(" ");
        numSpaces--;
      }
    }else{
      int m = numSpaces % (num - 1);
      int k = numSpaces / (num - 1);
      for(int i = 0; i < num - 1; i++){
        sb.append(words.get(i));
        int spaces = i < m ? k + 1 : k;
        for(int j = 0; j < spaces; j++){
          sb.append(" ");
        }
      }
      sb.append(words.get(num - 1));
    }
    return sb.toString();
  }

  public static void main(String[] args){
    String[] words = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
    Solution s = new Solution();
    List<String> ret = s.fullJustify(words, 16);
    for(String str : ret){
      System.out.println(str);
    }
  }
}
