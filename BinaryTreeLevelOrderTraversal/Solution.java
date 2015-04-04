/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;

public class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    if(root == null) return res;
    Queue<TreeNode> queue = new LinkedList<TreeNode>();
    queue.add(root);
    int counter = 1;
    List<Integer> level = new ArrayList<Integer>();
    while(!queue.isEmpty()){
      if(counter == 0){
        counter = queue.size();
        res.add(level);
        level = new ArrayList<Integer>();
      }else{
        TreeNode node = queue.poll();
        if(node.left != null) queue.add(node.left);
        if(node.right != null) queue.add(node.right);
        level.add(node.val);
        counter--;
      }
    }
    res.add(level);
    return res;
  }
}
