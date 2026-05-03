class Solution {
    public int strStr(String haystack, String needle) {
        int len1=needle.length();
        int len2=haystack.length();
        int index=0;
        for(int i=0;i<=(len2-len1);i++)
        {
            String temp=haystack.substring(i,i+len1);
            if(temp.equals(needle))
            return i;
        }
        return -1;
    }
}