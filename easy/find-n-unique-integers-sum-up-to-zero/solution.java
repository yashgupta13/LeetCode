class Solution {
    public int[] sumZero(int n) {
        int []arr=new int[n];
        if(n%2==0)
        {
            int mid = n / 2;
            for(int i=0;i<mid;i++)
            {
                arr[mid-1-i]=0-i-1;
                arr[mid+i]=i+1;
            }
        }else{
            int mid=(n-1)/2;
            arr[mid]=0;
            for(int i=1;i<=mid;i++)
            {
                arr[mid-i]=0-i;
                arr[mid+i]=0+i;
            }

        }

        return arr;
    }
}