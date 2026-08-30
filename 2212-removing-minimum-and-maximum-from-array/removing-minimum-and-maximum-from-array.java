class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n <= 1) return n;

        int smallIndex = 0;
        int largeIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[smallIndex]) smallIndex = i;
            if (nums[i] > nums[largeIndex]) largeIndex = i;
        }

        int left = Math.min(smallIndex, largeIndex);
        int right = Math.max(smallIndex, largeIndex);

        int deleteFromLeftOnly = right + 1;
        int deleteFromRightOnly = n - left;
        int deleteFromBothSides = (left + 1) + (n - right);

        return Math.min(deleteFromLeftOnly, Math.min(deleteFromRightOnly, deleteFromBothSides));
    }
}