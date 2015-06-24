/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
  public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode curr = dummy;
    while(curr.next != null && curr.next.next!= null){
      ListNode next = curr.next;
      curr.next = next.next;
      next.next = curr.next.next;
      curr.next.next = next;
      curr = curr.next.next;
    }
    return dummy.next;
  }
}
