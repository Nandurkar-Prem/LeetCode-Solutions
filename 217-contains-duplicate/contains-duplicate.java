class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean duplicate = false;

        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }

        for(int i : nums){
            int value = map.get(i);
            if(value > 1){
                duplicate = true;
            }
        }
        return duplicate;
    }
}