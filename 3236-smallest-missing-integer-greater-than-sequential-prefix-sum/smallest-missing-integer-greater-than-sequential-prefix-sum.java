class Solution {
    public int missingInteger(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int prefixSum = nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1){
                prefixSum += nums[i];
            }else{
                break;
            }
        }
        int candidate = prefixSum;
        while(true){
            boolean found = false;

            for(int num : nums){
                if(candidate == num){
                    found = true;
                    break;
                }
            }

            if(!found){
                return candidate;
            }
            candidate++;
        }
    }
}