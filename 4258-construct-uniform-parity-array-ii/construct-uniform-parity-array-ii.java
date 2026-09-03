class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;

        for(int i : nums1){
            if(i % 2 != 0){
                minOdd = Math.min(minOdd, i);
            }
        }

        for(int x : nums1){
            if(x % 2 == 0 && minOdd != Integer.MAX_VALUE && x < minOdd){
                return false;
            }
        }
        return true;
    }
}