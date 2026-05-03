class Solution {
    public int[] plusOne(int[] di) {
        boolean chk=false;int i=0;
        di[di.length-1]=di[di.length-1]+1;
        for(i=di.length-1;i>=0;i--)
        {
            if(di[i]==10 && i>=1)
            {
                di[i]=0;
                di[i-1]=di[i-1]+1;
            }
            if(i==0)
            {
                if(di[i]==10)
                {
                    di[i]=0;
                    chk=true;
                }
            }
        }
        if(chk)
        {
            int ans[]=new int[di.length+1];
            ans[0]=1;
            for(i=1;i<=di.length;i++)
            ans[i]=di[i-1];
            return ans;
        }else
        return di;
    }
    }
