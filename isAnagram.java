class Solution {
    public boolean isAnagram(String s, String t) {
        /*
            Create a hashmap to contain all of characters and their word frequencies
            Firstly, iterate through string s to get characters and frequency stored in hash map
            Secondly, iterate through string t and then append it to the second hashmap
            Compare two hashmaps together, if they equals, t should be anagram of s
            map = [
                a: 3
                n: 1
                g: 1
                r: 1
                m: 1
            ]
        */
        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i),1);
            } else {
                int frequency = map.get(s.charAt(i));
                map.put(s.charAt(i),frequency + 1);
            }
        }
        
        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
        for (int i = 0; i < t.length(); i++) {
            if (!map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i),1);
            } else {
                int frequency = map2.get(t.charAt(i));
                map2.put(t.charAt(i),frequency + 1);
            }
        }
        
        if (map.equals(map2)) {
            return true;
        } else {
            return false;
        }
    }
}
