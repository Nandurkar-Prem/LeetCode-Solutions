class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;
        
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(fast != slow);

        if(slow == 1){
            return true;
        }
        return false;
    }

    static int findSquare(int n){
        int sum = 0;
        while(n > 0){
            int mod = n % 10;
            sum += mod*mod;
            n /= 10;
        }
        return sum;
    }
}