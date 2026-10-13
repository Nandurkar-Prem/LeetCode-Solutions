class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] squared = new long[n];

        for(int i=0;i<n;i++){
            squared[i] = (long)nums[i] * nums[i];
        }
        Arrays.sort(squared);

        long ans = 0;
        int half = n/2;
        for(int i=0;i<n;i++){
            if(i < half){
                ans -= squared[i];
            }else{
                ans += squared[i];
            }
        }
        return ans;
    }
}