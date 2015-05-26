/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
  public boolean isSymmetric(TreeNode root) {
    if(root == null){
      return true;
    }
    return isSymmetricNode(root.left, root.right);
  }

  public boolean isSymmetricNode(TreeNode one, TreeNode two){
    if(one == null && two == null) return true;
    if(one == null || two == null) return false;
    if(one.val != two.val) return false;
    return isSymmetricNode(one.left, two.right) &&
      isSymmetricNode(one.right, two.left);
  }
  
  public boolean isSymmetric(TreeNode root){
    if(root == null) return true;
    List<TreeNode> list = new ArrayList<TreeNode>();
    list.add(root);
    int childNum = 1;
    while(childNum > 0){
      int low = list.size() - childNum;
      int hig = list.size() - 1;
      while(low <= hig){
        if(checkNodes(list.get(low).left, list.get(hig).right) &&
            checkNodes(list.get(low).right, list.get(hig).left)){
          low++;
          hig--;
        }else{
          return false;
        }
      }
      int i = list.size() - childNum;
      int end = list.size();
      childNum = 0;
      for(; i < end; i++){
        if(list.get(i).left != null){
          list.add(list.get(i).left);
          childNum++;
        }
        if(list.get(i).right != null){
          list.add(list.get(i).right);
          childNum++;
        }
      }
    }
    return true;
  }

  private boolean checkNodes(TreeNode one, TreeNode two){
    if(one == null && two == null) return true;
    if(one == null || two == null) return false;
    if(one.val != two.val) return false;
    return true;
  }
}
