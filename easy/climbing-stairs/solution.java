class Solution {
    public int climbStairs(int n) {
        // this solution only works till 30-31 
        // if(n==1 || n==2)
        // {
        //     return n;
        // }
        // int x=climbStairs(n-1);
        // int y=climbStairs(n-2);

        // return x+y;

        if (n <= 3) return n;

        int prev1 = 3;
        int prev2 = 2;
        int cur = 0;

        for (int i = 3; i < n; i++) {
            cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }

        return cur;  
        
    }
}