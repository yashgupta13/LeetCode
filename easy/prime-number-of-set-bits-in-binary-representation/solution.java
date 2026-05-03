class Solution {
    // static {
    //     Runtime.getRuntime().addShutdownHook(new Thread(() -> {
    //         try (FileWriter fw = new FileWriter("display_runtime.txt")) {
    //             fw.write("000");
    //         } catch (Exception e) {
    //             e.printStackTrace();
    //         }
    //     }));
    // }
    public int countPrimeSetBits(int left, int right) {
        int count =0;
        for(int i=left;i<=right;i++)
        {
            if(isPrime(Integer.bitCount(i)))
            count++;

        }
        return count;
    }
    public static boolean isPrime(int n)
    {
        int arr[]=new int []{2, 3, 5, 7, 11, 13, 17 , 19};
        for(int i=0;i<arr.length;i++)
        {
            if(n==arr[i])
            return true;
        }
        return false;
    }
}