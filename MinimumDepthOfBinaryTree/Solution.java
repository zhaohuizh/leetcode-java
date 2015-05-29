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
  public int minDepth(TreeNode root) {
    if(root == null) return 0;
    if(root.left == null && root.right == null) return 1;
    int res = Integer.MAX_VALUE;
    if(root.left != null){
      res = minDepth(root.left);
    }
    if(root.right != null){
      res = Math.min(res, minDepth(root.right));
    }
    return res + 1;
  }
}
