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
    public boolean isPalindrome(ListNode head) {
        /*
        Traverse the linked list to obtain its numbers and store it to the variable
        Method 1: Write a helper method to determine if the variable is palindrome
        Method 2: the reverse of a palindrome string is the same as original 
        Method 3: find the end of first half linked list. Reverse the second half and then traverse through two sub linked list and compare 
        one by one
        */
        ListNode last_first_half = getLastFirstHalf(head);
        ListNode first_second_half = reverseList(last_first_half.next);
        boolean signal = false;
        while (signal == false && first_second_half != null) {
            if (head.val != first_second_half.val) {
                signal = true;
            }
            head = head.next;
            first_second_half = first_second_half.next;
        }
        return !signal;
        
        
        //String str = "";
        //return reverse(str);
    }
    public ListNode getLastFirstHalf(ListNode node) {
        ListNode slow_ptr = node;
        ListNode fast_ptr = node;
        while (fast_ptr.next != null && fast_ptr.next.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
        return slow_ptr;
    }
    
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
    
    
    public boolean reverse(String str) {
        String res = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            res += str.charAt(i);
        }
        System.out.println(res);
        System.out.println(str);
        if (res.equals(str)) {
            return true;
        } else {
            return false;
        }
    }
    /*
    public boolean helper(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
            
        }
        return true;
    }*/
}
