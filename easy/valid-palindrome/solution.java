class Solution {
    public boolean isPalindrome(String s) {
       String rev="";
       String n=""; 
       for(int i= 0;i<s.length();i++)
        {
           char chr=s.charAt(i);
           if( (((int)chr)>=65 && ((int)chr)<=90) || (((int)chr)>=97 && ((int)chr)<=122) ||  (((int)chr)>=48 && ((int)chr)<=57)){
              n=n+chr;
           }
        }
       if(n.length()==1)
       return true;
        for(int j= n.length()-1;j>=0;j--)
        {
           char ch=n.charAt(j);
           
              rev=rev+ch;
           
        }
        return n.equalsIgnoreCase(rev);
    }
}