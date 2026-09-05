class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] suffix = new int[n];
        int prefixSum = Integer.MIN_VALUE;

        suffix[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i] = Math.min(suffix[i+1], nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            prefixSum = Math.max(prefixSum, nums[i]);

            if(prefixSum - suffix[i] <= k){
                return i;
            }
        }
        return -1;
    }
}