class Solution {
    public boolean checkOnesSegment(String s) {
        boolean flag=false;
        s=s+"0";
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {temp=temp+"1";}
            else{
                if(flag==false && temp.length()>0)
                {flag=true; temp=""; continue;}

                if(flag && temp.length()>0){return false;}
                temp="";
                
            }
        }

        return flag;
    }
}