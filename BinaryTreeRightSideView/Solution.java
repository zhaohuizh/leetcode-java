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
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> res = new ArrayList<Integer>();
    Queue<TreeNode> nodes = new LinkedList<TreeNode>();
    if(root == null) return res;
    int counter = 1;
    nodes.add(root);
    while(!nodes.isEmpty()){
      TreeNode node = nodes.poll();
      if(node.left != null) nodes.add(node.left);
      if(node.right != null) nodes.add(node.right);
      counter--;
      if(counter == 0){
        res.add(node.val);
        counter = nodes.size();
      }
    }
    return res;
  }
}
