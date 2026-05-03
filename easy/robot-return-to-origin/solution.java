class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;

        for(int i=0;i<moves.length();i++)
        {
            switch(moves.charAt(i))
            {
                case 'L':
                    x+=1;
                    break;
                case 'R':
                    x-=1;
                    break;
                case 'U':
                    y+=1;
                    break;
                case 'D':
                    y-=1;
            }
        }
        return (x==0 && y==0);
    }
}