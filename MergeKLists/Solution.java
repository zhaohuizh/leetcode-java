/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
    int listSize = lists.length;
    if(listSize == 0) return null;
    PriorityQueue<ListNode> heap = new PriorityQueue<ListNode>(listSize, new Comparator<ListNode>(){
      public int compare(ListNode node1, ListNode node2){
        return node1.val - node2.val;
      }
    });
    for(ListNode node : lists){
      if(node != null){
        heap.add(node);
      }
    }
    ListNode ret = heap.poll();
    ListNode node = ret;
    while(heap.size() > 0){
      if(node.next != null){
        heap.add(node.next);
      }
      node.next = heap.poll(); 
      node = node.next;
    }
    return ret;
  }
}
