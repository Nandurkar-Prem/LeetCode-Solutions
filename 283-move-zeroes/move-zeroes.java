class Solution {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int len = nums.length;

        for(int i=0;i<len;i++){
            if(nums[i] != 0){
                if(i != start){
                    int temp = nums[start];
                    nums[start] = nums[i];
                    nums[i] = temp;
                }
                start++;
            }
        }
    }
}