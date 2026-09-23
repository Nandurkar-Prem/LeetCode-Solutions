class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFrequency = 0;
        int ans = 0;

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxFrequency){
                maxFrequency = entry.getValue();
                ans = entry.getKey();
            }
        }
        return ans;
    }
}