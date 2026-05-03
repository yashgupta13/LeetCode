class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int cp=x;
        while (cp>0)
        {
            rev=rev*10+(cp%10);
            cp/=10;
        }
        if(x==rev)
        return true;
        else
        return false;
    }
}