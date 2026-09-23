class Solution {
    public int minOperations(int[] nums, int x) {
        int maxSum = 0;
        for(int i : nums){
            maxSum += i;
        }

        int target = maxSum - x;

        if(target == 0){
            return nums.length;
        }
        if(target < 0){
            return -1;
        }

        int left = 0;
        int currSum = 0;
        int maxlen = -1;

        for(int i=0;i<nums.length;i++){
            currSum += nums[i];

            while(currSum > target && left <= i){
                currSum -= nums[left];
                left++;
            }

            if(currSum == target){
                maxlen = Math.max(maxlen, i-left+1);
            }
        }
        if(maxlen != -1){
            return nums.length-maxlen;
        }else{
            return -1;
        }
    }
}