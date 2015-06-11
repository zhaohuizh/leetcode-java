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
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    if(preorder.length == 0){
      return null;
    }
    return helper(preorder, inorder, 0, preorder.length - 1, 0);
  }

  private TreeNode helper(int[] preorder, int[] inorder, int start, int end, int rootIdx){
    if(start > end){
      return null;
    }
    TreeNode node = new TreeNode(preorder[rootIdx]);
    int inOrderIdx = 0;
    for(int i = start; i <= end; i++){
      if(preorder[rootIdx] == inorder[i]){
        inOrderIdx = i;
        break;
      }
    }
    node.left = helper(preorder, inorder, start, inOrderIdx - 1, rootIdx + 1);
    node.right = helper(preorder, inorder, inOrderIdx + 1, end, rootIdx + 1 + inOrderIdx - start);
    return node;
  }
}
