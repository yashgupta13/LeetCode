import java.util.*;
class Solution {
    public int reverse(int x) {

    long rev=0;
        boolean ch=false;
        if(x<0)
        {
            x*=-1;
            ch=true;
        }
        while(x>0)
        {
            rev=rev*10+x%10;
            x/=10;
        }
        long range=(int)Math.pow(2,31);
        if(rev>(range-1)){
        return 0;}


        if(ch){
            rev=rev*(-1);
        return (int)rev;}
        return (int)rev;
    }
}