class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=binarySearch(nums,target);
        if(first==-1)return new int[]{-1,-1};

        while(first>0 && nums[first-1]==target)
        first--;

        int last=first;

        while(last<nums.length-1 && nums[last+1]==target)
        last++;

        return new int[]{first,last};

    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // avoids overflow

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; 
    }

}