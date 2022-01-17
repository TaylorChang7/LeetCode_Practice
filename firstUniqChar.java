class Solution {
    public int firstUniqChar(String s) {
        /*
        Declare a hashmap
        Iterate through the string char by char
        If a char is not in the hashmap, add it to hashmap where its key value is the index position
        Else modify its key value to be -1, which is a signal of repeated character being detected
        l: 0
        e: 1
        e: -1
        t: 3
        c: 4
        o: 5
        d: 6
        e: 7
        */
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),-1);
            } else {
                map.put(s.charAt(i),i);
            }
        }
        int res = Integer.MAX_VALUE;
        for (Map.Entry<Character,Integer> set : map.entrySet()) {
            if (set.getValue() < res && set.getValue() != -1) {
                res = set.getValue();
            }
        }
        if (res == Integer.MAX_VALUE) {
            return -1;
        }
        return res;
        
    }
}
