class Solution {
    public int singleNumber(int[] nums) {
        /*
            Requirements:
            Run-time: O(n)
            Space: O(1)
            Recall XOR logical operator:
            any val XOR 0 = any val
            any val XOR itself = 0
            Using this logic, suppose we iterate through every single element in the array and keep XORING all of them together:
            Given array = [4,1,2,1,2]
            Our expression would be 4 XOR 1 XOR 2 XOR 1 XOR 2
            Rearrange:
            4 XOR (1 XOR 1) XOR (2 XOR 2)
            4 XOR 0 XOR 0 = 4 XOR 0 = 4
            Hence, 4 is the answer
        */
        int res = nums[0];
        for (int i = 1; i < nums.length;i++) {
            res ^= nums[i]; // nums[0] XOR nums[1] XOR nums[2].... XOR nums[-1]
        }
        return res;
    }
}
