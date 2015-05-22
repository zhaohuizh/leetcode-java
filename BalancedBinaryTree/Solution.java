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
  public boolean isBalanced(TreeNode root) {
    int height = getHeight(root);
    if(height < 0){
      return false;
    }
    return true;
  }

  public int getHeight(TreeNode node){
    if(node == null) return 0;
    int leftHeight = getHeight(node.left);
    int rightHeight = getHeight(node.right);
    if(leftHeight < 0 || rightHeight < 0 
        || Math.abs(leftHeight - rightHeight) > 1){
      return -1;
    }
    return Math.max(leftHeight, rightHeight) + 1;
  }
}
