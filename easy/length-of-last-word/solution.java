class Solution {
    public int lengthOfLastWord(String s) {
        int count=0,i=0;
        for( i=s.length()-1;i>=0;i--)
        {
            int o=(int)s.charAt(i);
            if(o!=32)
            {
            
            break;}
        }
        for( ;i>=0;i--)
    {
        if(s.charAt(i)==' ')
        break;
        count++;
    }
    return count;
    }
}