class Solution {
    public int smallestIndex(int[] nums) {
        int[] digitSum = new int[nums.length];

        for(int i=0;i<digitSum.length;i++){
            digitSum[i] = digitSum(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(i == digitSum[i]){
                return i;
            }
        }
        return -1;
    }

    static int digitSum(int n){
        int sum = 0;
        while(n > 0){
            int mod = n % 10;
            sum += mod;
            n /= 10;
        }
        return sum;
    }
}