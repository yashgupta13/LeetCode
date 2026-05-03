class Solution {
    public String reverseWords(String s) {
        if(s==null){return null;}

        int front=s.length();
        int back=s.length()+1;
        String ans="";
        s=" "+s;

        while (front>=0 && back>=0) {

            do{
                back--;
            }while(back>=0 && s.charAt(back)==' ');

            front=back;

            do{
                front--;
            }while(front>=0 && s.charAt(front)!=' ');
            if(front<0){break;}

            ans=ans+" "+s.substring(front+1, back+1);
            back=front;

        }
        return ans.substring(1,ans.length());
        
    }
}