import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        /*
            This problem can be easily solved if the use of stack data structure
            Example:
            Given string s = abbaca
            Iterate through string s, append it to the stack, and pop if the current element is the same as the element in the stack
            i = 0
            stack = [a]
            i = 1
            stack = [a,b]
            i = 2
            stack = [a,b] curr_element = b
            we see that curr_element == stack[-1]
            pop it out
            now stack = [a]
            repeat the same process
        */
        int n = s.length();
        int top = 0;
        Stack<Character> stack = new Stack<Character>();
                
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if (stack.peek() == s.charAt(i)) {
                    stack.pop();
                } else {
                    stack.push(s.charAt(i));
                }
            }
            
        }
        Iterator curr_char = stack.iterator();
        String res = "";
        while (curr_char.hasNext()) {
            res += curr_char.next();
        }
        return res;
    }
}
