class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] count = new int[1001];
        int size = 0;
        for (int i=0; i<nums1.length; i++)
            count[nums1[i]] = 1;
        for (int i=0; i<nums2.length; i++) {
            if (count[nums2[i]] == 1) {
                size++;
                count[nums2[i]] = 2;
            }
        }
        int[] ans = new int[size];
        int ptr = 0;
        for (int i=0; i<=1000; i++) {
            if (count[i] == 2)
                ans[ptr++] = i;
        }
        return ans;
    }
}