class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int degree = 1;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int ascii = ch;
            ans += ((122 - ascii + 1) * degree); 
            degree++;
        }
        return ans;
    }
}