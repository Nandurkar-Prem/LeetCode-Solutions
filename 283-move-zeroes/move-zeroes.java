class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int len = nums.length;

        // Step 1: Overwrite forward with non-zero elements
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[start] = nums[i];
                start++;
            }
        }

        // Step 2: Fill the rest of the array with zeroes
        while (start < len) {
            nums[start] = 0;
            start++;
        }
    }
}