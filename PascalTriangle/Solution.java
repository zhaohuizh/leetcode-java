import java.util.*;

public class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    if(numRows == 0) return res;
    List<Integer> curr = new ArrayList<Integer>();
    curr.add(1);
    res.add(curr);
    for(int i = 1; i < numRows; i++){
      List<Integer> level = new ArrayList<Integer>();
      level.add(1);
      for(int j = 1; j < res.get(i - 1).size(); j++){
        level.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
      }
      level.add(1);
      res.add(level);
    }
    return res;
  }
}
