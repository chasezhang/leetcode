/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode first = head;
        
        while(first.next != null) {
            if (first.val == first.next.val) {
                first.next = first.next.next;

            } else {
                first = first.next;
            }
        }
        return head;
    }
}