class Solution {
    public String longestCommonPrefix(String[] str) {
        String ans="";
        boolean b=false;
        int len=str[0].length();
        for(int k=0;k<str.length;k++)
        {
            if(str[k].length()<len)
            len=str[k].length();
        }
        for(int i=0;i<len;i++)
        {
            char ch=str[0].charAt(i);
            for(int j=0;j<str.length;j++)
            {
                if(str[j].charAt(i)==ch)
                {
                    b=true;
                    continue;
                }else
                {
                    b=false;
                    break;
                }
            }
            if(b)
            {
                ans=ans+ch;
            }else{break;}
        }
        return ans;
    }
}