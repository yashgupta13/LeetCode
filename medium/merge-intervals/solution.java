class Solution {
    public int[][] merge(int[][] intervals) {
        int scale[]=new int[10001];
        for(int i=0;i<intervals.length;i++)
        {
            for(int j=intervals[i][0];j<intervals[i][1];j++)
            {
                scale[j]=1;
            }
            if(scale[intervals[i][1]]==0)
                scale[intervals[i][1]]=-1;
        }

        // for(int i=0;i<scale.length;i++)
        // System.out.print(" "+scale[i]);


         List<int[]> result = new ArrayList<>();
        int start = -1;

        for(int i = 0; i < scale.length; i++) {

            if(scale[i] == 1) {
                if(start == -1) start = i;
            }

            else if(scale[i] == -1) {
                if(start != -1) {
                    result.add(new int[]{start, i});
                    start = -1;
                } else {
                    result.add(new int[]{i, i});
                }
            }

            else { // 0
                if(start != -1) {
                    result.add(new int[]{start, i - 1});
                    start = -1;
                }
            }
        }

        if(start != -1) {
            result.add(new int[]{start, scale.length - 1});
        }

        return result.toArray(new int[result.size()][]);
    }
}