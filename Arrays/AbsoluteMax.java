package Arrays;

import java.util.Arrays;

class AbsoluteMax{
    public static void main(String[] args)
    {
        int[] A= {1,2,3,4};
        int[] B = {-1, 4, 5, 6};
        int[] C = {-10, 5, 3, -8};
        int[] D = {-1, -9, -6, -10};

        int[] pfA = new int[A.length];
        int[] pfB = new int[A.length];
        int[] pfC = new int[A.length];
        int[] pfD = new int[A.length];

        
        if(A[0]<0)
            pfA[0] = -A[0];
        else
            pfA[0] = A[0];   
            
        if(B[0]<0)
            pfB[0] = -B[0];
        else
            pfB[0] = B[0];     

        if(C[0]<0)
            pfC[0] = -C[0];
        else
            pfC[0] = C[0];  
        if(D[0]<0)
            pfD[0] = -D[0];
        else
            pfD[0] = D[0];                
        

        for(int i = 1; i < A.length; i++)
        {
            if(A[i]-pfA[i-1] < 0)
            {
                pfA[i] = -(A[i]-pfA[i-1]);
            }
            else
            {
                pfA[i] = (A[i]-pfA[i-1]);
            }
            

            if(B[i]-pfB[i-1] < 0)
            {
                pfB[i] = -(B[i]-pfB[i-1]);
            }
            else
            {
                pfB[i] = (B[i]-pfB[i-1]);
            }

            if(C[i]-pfC[i-1] < 0)
            {
                pfC[i] = -(C[i]-pfC[i-1]);
            }
            else
            {
                pfC[i] = (C[i]-pfC[i-1]);
            }

            if(D[i]-pfD[i-1] < 0)
            {
                pfD[i] = -(D[i]-pfD[i-1]);
            }
            else
            {
                pfD[i] = (D[i]-pfD[i-1]);
            }
        }

        int ans = 0;
        for(int i = 0; i < A.length; i++)
        {
            int sum = pfA[i]+pfB[i]+pfC[i]+pfD[i];
            ans = getMax(sum, ans);
        }

        System.out.println(Arrays.toString(pfA));
        System.out.println(Arrays.toString(pfB));
        System.out.println(Arrays.toString(pfC));
        System.out.println(Arrays.toString(pfD));

        System.out.println(ans);

    }

    private static int getMax(int current, int previous)
    {
        if(current>previous)
            return current;
        return previous;
    }
}