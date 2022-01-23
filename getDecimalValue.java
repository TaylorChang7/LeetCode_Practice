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
    public int getDecimalValue(ListNode head) {
        String binary = "";
        while (head != null) {
            binary += head.val;
            head = head.next;
        }
        int res = 0;
        String binary_reverse = reverse(binary);
        for (int i = 0; i < binary_reverse.length(); i++) {
            if (binary_reverse.charAt(i) == '1') {
                res += Math.pow(2,i);
            }
            
        }
        return res;
        
    }
    public String reverse(String binary) {
        String ret = "";
        for (int i = binary.length() - 1; i >= 0; i--) {
            ret += binary.charAt(i);
        }
        return ret;
    }
}
