class Solution {
    public int bitwiseComplement(int num) {
        if(num==0)return 1;
        int count=0;
        int cpy=num;
        while(num>0)
        {
            count++;
            num/=2;
        }
        long ans=(long)Math.pow(2,count);
        ans=ans-1-cpy;
        return (int)ans;
    }
}