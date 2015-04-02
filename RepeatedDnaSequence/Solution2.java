import java.util.*;
public class Solution2 {
  private static Map<Character, Integer> compressMap = new HashMap<>();
  static {
    compressMap.put('A', 0);
    compressMap.put('C', 2);
    compressMap.put('G', 1);
    compressMap.put('T', 3);
  }

  private int compressStr(String str, int begin){
    int x = 0;
    for(int i = begin; i < begin + 10; i++){
      x |= compressMap.get(str.charAt(i)); 
      x <<= 2;
    }
    return x;
  }
  
  public List<String> findRepeatedDnaSequences(String s) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    List<String> res = new ArrayList<String>();
    for(int i = 0; i <= s.length() - 10; i++){
      int key = compressStr(s, i);
      if(!map.containsKey(key)){
        map.put(key, 1);
      }else{
        if(map.get(key) == 1){
          res.add(s.substring(i, i + 10));
          map.put(key, 2);
        }
      }
    }
    return res;
  }
}
