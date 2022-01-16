class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
            1. Create a hashmap 
            2. Iterate through the given array to get each number frequency
            3. Iterate through a hashmap under this condition:
                a. if a number has a frequency (key value) > 2, return true immediately
            4. Return false at the end
        */
        HashMap<Integer,Integer> map = new HashMap<>();
        //int key_val = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
                /*
                key_val = map.get(nums[i]) + 1;
                map.put(nums[i],key_val); //update
                */
            } else {
                map.put(nums[i],1); //first apperance 
            }
        }
        return false;
    }
}
