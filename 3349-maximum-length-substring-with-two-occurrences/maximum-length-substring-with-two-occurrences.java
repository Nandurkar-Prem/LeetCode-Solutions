class Solution {
    public int maximumLengthSubstring(String s) {
        //Here we have to use the Sliding Window pattern
        int length = 0;
        int left = 0;
        int[] charFrequency = new int[26];//It's a frequency array

        for(int right=0;right<s.length();right++){
            charFrequency[s.charAt(right) - 'a']++;

            while(charFrequency[s.charAt(right) - 'a'] > 2){
                charFrequency[s.charAt(left) - 'a']--;
                left++;
            }
            length = Math.max(length, right-left+1);
        }
        return length;
    }
}