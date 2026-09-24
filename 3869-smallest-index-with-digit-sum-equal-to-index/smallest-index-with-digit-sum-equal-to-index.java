class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int[] digitSum = new int[n];

        for(int i=0;i<n;i++){
            digitSum[i] = digitSum(nums[i]);
        }

        for(int i=0;i<n;i++){
            if(i == digitSum[i]){
                return i;
            }
        }
        return -1;
    }

    static int digitSum(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum; 
    }
}