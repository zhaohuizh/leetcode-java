import java.util.*;

public class SolutionDivideNConquer{
  public List<Integer> rightSideView(TreeNode root){
    List<Integer> res = new ArrayList<Integer>();
    if(root == null) return res;
    List<Integer> left = rightSideView(root.left);
    List<Integer> right = rightSideView(root.right);
    res.add(root.val);
    for(int i = 0; i < Math.max(left.size(), right.size()); i++){
      if(i < right.size()){
        res.add(right.get(i));
      }else{
        res.add(left.get(i));
      }
    }
    return res;
  }
}
