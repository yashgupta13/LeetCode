class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int pointer=0;
        for(int i=0;i<n;i++)
        {
            ans[pointer]=nums[i];
            pointer++;
            ans[pointer]=nums[n+i];
            pointer++;
        }
        return ans;
        
    }
}