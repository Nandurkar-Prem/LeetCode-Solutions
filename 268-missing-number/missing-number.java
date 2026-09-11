class Solution {
    public int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;

        for(int i : nums){
            xor1 ^= i;
        }
        for(int i=0;i<=nums.length;i++){
            xor2 ^= i;
        }
        return xor1 ^ xor2;
    }
}