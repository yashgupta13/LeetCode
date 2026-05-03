class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        int row[]=new int[mat.length];
        int column[]=new int [mat[0].length];

        for(int i=0;i<row.length;i++)
        {
            for(int j=0;j<column.length;j++)
            {
                if(mat[i][j]==1){row[i]++;}
            }
        }

        for(int i=0;i<column.length;i++)
        {
            for(int j=0;j<row.length;j++)
            {
                if(mat[j][i]==1){column[i]++;}
            }
        }

        for(int i=0;i<row.length;i++)
        {
            if(row[i]>1)continue;
            for(int j=0;j<column.length;j++)
            {
                if(column[j]>1)continue;
                if(mat[i][j]==1)
                count++;
            }
        }

        return count;

    }
}