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
}
