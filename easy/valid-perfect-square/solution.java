class Solution {
    public boolean isPerfectSquare(int num) {
        if(Math.sqrt(num)%1==0)
        {
            return true;
        }
        return false;
    }
}