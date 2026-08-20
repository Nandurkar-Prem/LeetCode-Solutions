class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }

        for(int freq : map.values()){
            if(freq % 2 != 0){
                return false;
            }
        }
        return true;
    }
}