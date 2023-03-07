package Arrays;

import java.util.Arrays;

public class SumOddIndices {
    public static void main(String[] args)
    {

        // int[] A = {2, 1, 8, 3, 9};
        // int[][] B = { {0,3}, 
        // {2,4}   };
        // int[] A = {1, 2, 3, 4, 5};
        // int[][] B = {{0,2},{1,4}};

        int[] A = {3};
        int[][] B = {{0,0},{0,0}};


        solves(A, B);            

    }

    public static void solves(int[] A, int[][]B)
    {
        int[] res = new int[B.length];
        int[] pf = new int[A.length];
        int sum = 0;
        pf[0] = A[0];
        for(int i = 1; i <A.length; i++)
        {
            if(i%2!=0)
            {
                pf[i] = pf[i-1] + A[i];
            }
            else
            {
                pf[i] = pf[i-1];
            }
        }

        for(int i = 0; i < B.length; i++)
        {

            int L = B[i][0];
            int R = B[i][1];
            if(L == 0){
                res[i] = pf[R];
            }
            else{
                res[i] = pf[R] - pf[L-1];
            }
        }


        System.out.println(Arrays.toString(res));
    }

    public static int[] solve(int[] A, int[][] B)
    {   
        int[] res = new int[B.length];
        for(int i = 0; i < B.length; i++)
        {
            res[i] = addSumRange(B[i][0], B[i][1], A);
        }
        return res;
    }

    public static int addSumRange(int s, int e, int[] Arr)
    {
        int sum = 0;
        for(int i = s; i <= e; i++)
        {
            if(i%2!=0)
                sum += Arr[i];
            }
            // if(s%2 == 0)
            // {
            // if(i%2!=0)
            //     sum += Arr[i];
            // }
            // else
            // { 
            //     if(i%2 == 0)
            //         sum+= Arr[i];
            // }
        
        return sum;
    }


}

