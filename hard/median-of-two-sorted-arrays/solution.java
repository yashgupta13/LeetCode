class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int k=0;
        int i1;
        for(i1=0;i1<nums1.length;i1++)
        {
            arr[k]=nums1[i1];
            k++;
        }
        for(i1=0;i1<nums2.length;i1++)
        {
            arr[k]=nums2[i1];
            k++;
        }
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
         int l=arr.length;
         if(l%2==0)
         {
             l/=2;
             double a = arr[l-1]+arr[l];
             a/=2;
             return a;
         }else
         {
             k++;
             return ((double)arr[l/2]);
         }

    }
}