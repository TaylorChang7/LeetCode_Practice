class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        /*
        Declare two hashmaps
        Iterate through both arrays and add key pair value to both hashmaps where key is the value in array and value is its frequency
        Iterate through one hashmap and check if the key exists in the other hashmap. If so, append to the result array
        Convert ArrayList to regular array and return that array as a result
        */
        
        HashMap<Integer,Integer> map1 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> map2 = new HashMap<Integer,Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            map1.put(nums1[i],1); //we do not care about the key-value
        }
        for (int i = 0; i < nums2.length; i++) {
            map2.put(nums2[i],1); //we do not care about the key-value
        }
        
        for (Map.Entry item : map1.entrySet()) {
            if (map2.containsKey(item.getKey())) {
                // check for intersection
                res.add((int)item.getKey());
            }
        }

        int[] arr = new int[res.size()];
        // Arraylist -> regular array conversion
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}
