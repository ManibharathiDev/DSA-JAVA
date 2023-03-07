public class SpiralMatrix{
    public static void main(String[] args)
    {
        int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int row = 4;
        int col = 4;
        int[][] B = new int[row][col];
        int rows = 0;
        int cols = 0;
        int j = 0;
        while(col > 1)
        {
        for(int i = 0; i < col; i++)
        {
             B[rows][cols] = A[j];
             cols++;
             j++;
        }
        cols--;    
        rows++;
       
        for(int i = rows; i < row; i++)
        {
           
            B[rows][cols] = A[j];
            rows++;
            j++;
            
        }
        rows--;
        cols--;

        for(int i = cols; i>=0; i--)
        {
           
            B[rows][cols] = A[j];
            cols--;
            j++;
            
        }

        rows--;
        cols++;

        System.out.println("final rows=>"+rows);
        System.out.println("final cols=>"+cols);

        for(int i = 0; i<row-2; i++)
        {
           
            B[rows][cols] = A[j];
            rows--;
            j++;
            
        }

        col -= 2;
        
    }


        //Result
        for(int i = 0; i < row; i++)
        {
            for(int k = 0; k < col; k++)
            {
                System.out.print(B[i][k]+" ");
            }
            System.out.println(" ");
        }
    }
}