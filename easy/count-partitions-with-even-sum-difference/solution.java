class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int sumr=0;
        for(int i=0;i<nums.length-1;i++)
        {
            sumr=sumr+nums[i];
            int suml=0;
            for(int j=i+1;j<nums.length;j++)
            {
                suml=suml+nums[j];
            }

            if((suml-sumr)%2==0)
            count++;
        }

        return count;
    }
}