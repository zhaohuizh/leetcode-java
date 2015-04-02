import java.util.*;
/**
 * A simple solution, but will exceed memory limit
 * Please refer the C solution for further optimization
 */
public class Solution {
  public List<String> findRepeatedDnaSequences(String s) {
    List<String> res = new ArrayList<String>();
    Map<String, Integer> map = new HashMap<String, Integer>();
    for(int i = 0; i <= s.length() - 10; i++){
      String str = s.substring(i, i + 10);
      if(!map.containsKey(str)){
        map.put(str, 1);
      }else{
        map.put(str, map.get(str) + 1);
      }
    }
    for(String str : map.keySet()){
      if(map.get(str) > 1){
        res.add(str);
      }
    }
    return res;
  }
}
