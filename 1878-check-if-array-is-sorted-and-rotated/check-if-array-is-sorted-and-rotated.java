class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int orderBreak = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i] > nums[i+1]){
                orderBreak++;
            }
        }
        if(nums[0] < nums[n-1]){
            orderBreak++;
        }
        return (orderBreak < 2);
    }
}