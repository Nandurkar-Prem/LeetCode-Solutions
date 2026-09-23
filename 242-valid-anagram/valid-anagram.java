class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] charCounts = new int[26];

        for(int i=0;i<s.length();i++){
            charCounts[s.charAt(i) - 'a']++;
        }

        for(int i=0;i<t.length();i++){
            int index = t.charAt(i) - 'a';
            if(--charCounts[index] < 0){
                return false;
            }
        }
        return true;
    }
}