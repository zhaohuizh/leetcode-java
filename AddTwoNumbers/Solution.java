/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if(l1 == null) return l2;
    if(l2 == null) return l1;
    int carry = 0;
    ListNode dummy = new ListNode(0);
    ListNode prev = dummy;
    while(l1 != null || l2 != null){
      int val = carry;
      if(l1 != null){
        val += l1.val;
        l1 = l1.next;
      }
      if(l2 != null){
        val += l2.val;
        l2 = l2.next;
      }
      if(val >= 10){
        val -= 10;
        carry = 1;
      }else{
        carry = 0;
      }
      ListNode node = new node(val);
      prev.next = node;
      prev = node;
    }
    if(carry > 0){
      prev.next = new Node(carry);
    }
    return dummy.next;
  }
}
