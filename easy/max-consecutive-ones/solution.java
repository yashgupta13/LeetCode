class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int precount=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            precount++;
            else{
                if(count < precount)
                count=precount;
                precount=0;
            }
        }
        return Math.max(precount,count);
        
    }
}