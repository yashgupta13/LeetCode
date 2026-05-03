class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        return true;
        if(t.length()==0)
        return false;
        
        int tp=0;
        int sp=0;

        while(tp<t.length() && sp<s.length())
        {
            if(t.charAt(tp)==s.charAt(sp))
            sp++;

            tp++;
        }

        return sp==s.length();

    }
}