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
  private int sum;
  public int sumNumbers(TreeNode root) {
    sumNumbers(root, 0);
    return sum;
  }
  
  public void sumNumbers(TreeNode root, int val){
    if(root == null){
      sum += val;
      return;
    }
    if(root.left == null && root.right == null){
      sum += val * 10 + root.val;
    }
    if(root.left != null){
      sumNumbers(root.left, val * 10 + root.val);
    }
    if(root.right != null){
      sumNumbers(root.right, val * 10 + root.val);
    }
  }
}
