/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = head.next;
        ListNode curr = head;
        while(head.next != null){
            ListNode temp = prev;
            prev = temp;
            temp = curr.next;
            curr.next = curr;
        }
        return prev;
    }
}
