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
        /*
                    
            null -> 1 -> 2 -> 3
              ^     ^
              |     |
             prev  curr
        temp: store the next node of current node
        prev: keep track of the previous node to do the linking
        curr: current node iterated
        */
        ListNode prev = null;
        ListNode temp = null;
        ListNode curr = head;
        while (curr != null) {
            temp = curr.next; //store the next node as we will lose it once we do the linking
            curr.next = prev; //linking
            prev = curr; //update the previous node
            curr = temp; //move on to next node
        }
        return prev;
    }
}
