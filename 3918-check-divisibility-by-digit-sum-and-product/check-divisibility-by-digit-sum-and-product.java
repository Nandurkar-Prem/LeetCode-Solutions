class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;

        while(temp > 0){
            int mod = temp % 10;
            sum += mod;
            product *= mod;
            temp /= 10;
        }
        int totalSum = sum + product;
        return (n % totalSum) == 0; 
    }
}