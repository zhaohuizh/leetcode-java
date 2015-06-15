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
  public TreeNode invertTree(TreeNode root) {
    if(root == null){
      return null;
    }
    TreeNode copy = new TreeNode(root.val);
    copy.left = invertTree(root.right);
    copy.right = invertTree(root.left);
    return copy;
  }
}
