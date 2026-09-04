class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] suffixMin = new int[n];
        suffixMin[n-1] = nums[n-1];
        int prefixSum = Integer.MIN_VALUE;

        for(int i=n-2;i>=0;i--){
            suffixMin[i] = Math.min(suffixMin[i+1], nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            prefixSum = Math.max(prefixSum, nums[i]);

            if((prefixSum - suffixMin[i]) <= k){
                return i;
            }
        }
        return -1;
    }
}