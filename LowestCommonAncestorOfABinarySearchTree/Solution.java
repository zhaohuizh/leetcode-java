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
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) { 
    TreeNode curr = root;
    if(p.val > q.val){
      TreeNode tmp = p;
      p = q;
      q = tmp;
    }
    while(true){
      if(curr.val >= p.val && curr.val <= q.val){
        return curr;
      }
      if(curr.val > q.val){
        curr = curr.left;
      }else{
        curr = curr.right;
      }
    }
  }
}
