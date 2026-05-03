class Solution {
    public int findFinalValue(int[] nums, int original) {
        return helper(nums,original);
    }

    public static int helper(int nums[],int original)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==original)
            {
                return helper(nums,2*original);
            }
        }
        return original;
    }
}