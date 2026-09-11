class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        
        HashSet<Integer> commonNums = new HashSet<>();
        for(int num : nums2){
            if(set.contains(num)){
                commonNums.add(num);
            }
        }
        int i = 0;
        int[] ans = new int[commonNums.size()];
        for(int num : commonNums){
            ans[i++] = num;
        }
        return ans;
    }
}