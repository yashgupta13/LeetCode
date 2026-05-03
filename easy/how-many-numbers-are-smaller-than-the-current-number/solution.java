class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101]; // Since nums[i] is 0-100
        int n = nums.length;
        
        // Step 1: Frequency count
        for (int x : nums) {
            count[x]++;
        }
        
        // Step 2: Cumulative sum (Running total)
        // Ippo count[i] la i-ai vida chinna numbers ethana nu store pannuvom
        int runningSum = 0;
        int[] smallerCount = new int[101];
        for (int i = 0; i < 101; i++) {
            smallerCount[i] = runningSum;
            runningSum += count[i];
        }
        
        // Step 3: Result create pannunga
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = smallerCount[nums[i]];
        }
        
        return res;
    }
}