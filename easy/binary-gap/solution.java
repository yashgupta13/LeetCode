class Solution {
    public int binaryGap(int n) {
        int max=0;
        int count=0;
        while(n%2!=1)
        n=n>>1;
        if(n==1)
        return 0;
        
        while(n>0)
        {
            count++;

            if(n%2==1){
                if(count>max)
                max=count;
            count=0;
            }

            n/=2;
        }


     
       return max;
    }
}