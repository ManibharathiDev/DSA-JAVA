package Diagnol;

public class Diagnol {
    public static void main(String[] args)
    {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A.length; j++)
            {
                if(i == j)
                    System.out.println(A[i][j]+" ");
            }
        }

        int i = 0;
        int j = 0;
        while(i<A.length && j < A.length)
        {
            System.out.println(A[i][j]+" ");
            i++;
            j++;
        }

        // Anti Diagnol

        i = 0;
        j = A.length-1;
        while(i<A.length && j>=0)
        {
            System.out.println(A[i][j]+" ");
            i++;
            j--;
        }
    }
}
