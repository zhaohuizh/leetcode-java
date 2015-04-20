import java.util.Stack;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
  public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
  }

  Stack<TreeNode> stack = new Stack<TreeNode>();
  public BSTIterator(TreeNode root) {
    TreeNode node = root;
    while(node != null){
      stack.push(node);
      node = node.left;
    }
  }

  /** @return whether we have a next smallest number */
  public boolean hasNext() {
    return !stack.isEmpty();
  }

  /** @return the next smallest number */
  public int next() {
    TreeNode smallest = stack.pop();
    TreeNode tmp = smallest.right;
    while(tmp != null){
      stack.push(tmp);
      tmp = tmp.left;
    }
    return smallest.val;
  }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
