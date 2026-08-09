class Solution {
    public int subtractProductAndSum(int n) {
        int sum = calculateSum(n);
        int product = calculateProduct(n);
        return product-sum;
    }

    static int calculateProduct(int n){
        int product = 1;
        while(n > 0){
            int mod = n % 10;
            product *= mod;
            n /= 10;
        }
        return product;
    }

    static int calculateSum(int n){
        int sum = 0;
        while(n > 0){
            int mod = n % 10;
            sum += mod;
            n /= 10;
        }
        return sum;
    }
}