class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n-1;

        for(int p=n-1;p>=0;p--){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[p] = nums[left] * nums[left];
                left++;
            }else{
                result[p] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}