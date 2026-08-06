class Solution {
    public boolean check(int[] nums) {
        int orderBreak = 0;

        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                orderBreak++;
            }
        }
        if(nums[0] < nums[nums.length-1]){
            orderBreak++;
        }
        return (orderBreak < 2);
    }
}