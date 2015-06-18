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
  private int max = Integer.MIN_VALUE;
  public int maxPathSum(TreeNode root) {
    helper(root);
    return max;
  }

  private int helper(TreeNode root){
    if(root == null){
      return 0;
    }
    int left = helper(root.left);
    int right = helper(root.right);
    int ret = Math.max(left, right) + root.val;
    if(ret < root.val){
      ret = root.val;
    }
    max = Math.max(max, ret);
    max = Math.max(max, left + right + root.val);
    return ret;
  }
}
