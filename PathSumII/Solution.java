import java.util.*;
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
  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    if(root == null) return res;
    List<Integer> path = new ArrayList<Integer>();
    pathSumHelper(root, sum, res, path);
    return res;
  }

  private void pathSumHelper(TreeNode node, int sum,
      List<List<Integer>> res, List<Integer> path){
    if(node.val == sum && node.left == null && node.right == null){
      List<Integer> copy = new ArrayList<Integer>(path);
      copy.add(node.val);
      res.add(copy);
      return;
    }
    path.add(node.val);
    if(node.left != null){
      pathSumHelper(node.left, sum - node.val, res, path);
    }
    if(node.right != null){
      pathSumHelper(node.right, sum - node.val, res, path);
    }
    path.remove(path.size() - 1);
  }
}
