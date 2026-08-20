class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[nums.length];

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }

        list.sort((a, b) -> {
            int freqA = map.get(a);
            int freqB = map.get(b);
            
            if (freqA != freqB) {
                return freqA - freqB;
            } else {
                return b - a;
            }
        });

        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }
}