class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int index = 0;
        for(int i=1;i<n;i++){
            if(nums[index] != nums[i]){
                index++;
                swap(nums, index, i);
            }
        }
        return index+1;
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}