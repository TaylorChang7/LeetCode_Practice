class Solution {
    public int lengthOfLastWord(String s) {
        /*
        Iterate through the string s char by char
        Declare a temp to store the current constructed string
        If space is detected and next char is detected, then we reset the current string (since it is not the last)
        */
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                // Space is detected
                if (count > 0) {
                    // Case 1:
                    // "Hello World"
                    return count;
                } else {
                    // Case 2:
                    // "   fly me   to   the moon  "
                    // We did not begin counting yet. That means there are a lot of spaces at the end of the str
                    continue;
                }
            }
        }
        return s.trim().length();
        
        
        
    }
}
