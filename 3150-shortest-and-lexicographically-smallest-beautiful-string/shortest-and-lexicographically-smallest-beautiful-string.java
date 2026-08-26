class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int left = 0;
        int countOnes = 0;
        int minLength = Integer.MAX_VALUE;
        String result = "";

        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) == '1') {
                countOnes++;
            }

            while (countOnes == k) {
                int currentLength = right - left + 1;
                String currentSubstring = s.substring(left, right + 1);

                if (currentLength < minLength) {
                    minLength = currentLength;
                    result = currentSubstring;
                } 
                else if (currentLength == minLength) {
                    if (currentSubstring.compareTo(result) < 0) {
                        result = currentSubstring;
                    }
                }

                if (s.charAt(left) == '1') {
                    countOnes--;
                }
                left++;
            }
        }
        return result;
    }
}