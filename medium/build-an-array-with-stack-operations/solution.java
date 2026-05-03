class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<String>();
        int p=0;
        for(int i=1;i<=n;i++)
        {
            if(p==target.length)
            {
                break;
            }
            else if(target[p]==i)
            {
                ans.add("Push");
                p++;
            }else
            {
                ans.add("Push");
                ans.add("Pop");
            }
        }

        return ans;
    }
}