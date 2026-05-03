class Solution {
   public boolean kLengthApart(int[] nums, int k) {
        int front=0;
        do
        {
            while(nums[front]==0 && front<nums.length-k){front++;
            System.out.println(front);}
            
            for(int i=front+1;i<=front+k && i<nums.length;i++){
                System.out.println("i="+i);
                if(nums[i]==1)
                    return false;
            }
            front++;
        }while(front<nums.length-k-1);
        return true;
    }
}