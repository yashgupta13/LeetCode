class Solution {
    public int removeDuplicates(int[] nums) {
        for(int i1=0;i1<nums.length;i1++)
        {
            if(nums[i1]==9999)
            continue;
            for(int j1=i1+1;j1<nums.length;j1++)
            {
                if(nums[j1]==nums[i1])
                nums[j1]=9999;
            }
        }
        int count=0;
        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]!=9999)
            count++;
        }
         int n = nums.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(nums[j-1] > nums[j]){  
                                 //swap elements  
                                 temp = nums[j-1];  
                                 nums[j-1] = nums[j];  
                                 nums[j] = temp;  
                         }  
                          
                 }  
        
    }
    return count;
}
}