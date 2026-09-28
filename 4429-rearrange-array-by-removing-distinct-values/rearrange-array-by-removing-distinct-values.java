class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int index = 0;
        while(index < n){
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                int key = entry.getKey();
                int count = entry.getValue();

                if(count > 0){
                    ans[index++] = key;
                    map.put(key, count-1);
                }
            }
        }
        return ans;
    }
}