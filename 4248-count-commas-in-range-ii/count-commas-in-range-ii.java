class Solution {
    public long countCommas(long n) {
        //So this is a very simple question and before thinking on anything we just need to think about the base seperator like every number greater than n >= 1000 - (Has one comma) if we multiply n by 1000 then the no. of comma increases. So 1000 * 1000 = 1,000,000 (2 commas) that's why instead of counting the digits and using multiple if conditions we juat need a base seperator and an Ans vaiable to store commas in the range That's it!
        long ans = 0;
        long x = 1000;

        while(x <= n){
            ans += (n - x + 1);
            if(x > Long.MAX_VALUE/1000){
                break;
            }
            x *= 1000;
        }
        return ans;
    }
}