class ChrisTree{
    public static void main(String[] args)
    {

        int[] A = {1, 6, 4, 2, 6, 9};
        int[] B = {2, 5, 7, 3, 2, 7};
        int ans = Integer.MAX_VALUE;
        int cost = 0;
        int count = 0;
        //Brute Force Approch
        //TC : O(N*N*N) AND SC : 1
        for(int i = 0; i < A.length; i++)
        {
            for(int j = i+1; j< A.length; j++)
            {
                for(int k = j+1; k < A.length; k++)
                {
                    if(A[i] < A[j] && A[j] < A[k])
                    {
                        cost = B[i]+B[j]+B[k];
                        ans = getMin(ans, cost);
                        count++;
                    }
                }
            }
        }
        System.out.println("Brute Force Minimum Cost is => "+ans+" and count is =>"+count);
        //Our Approach;
        int leftSmall = 0;
        int rightLarge = 0;
        ans = Integer.MAX_VALUE;
        for(int j = 1; j < A.length; j++)
        {
            leftSmall = 0;
            for(int i = j-1; i >=0; i--)
            {
                if(A[i] < A[j])
                    {
                        leftSmall += B[i];
                        //leftSmall = B[j]+B[i];
                        System.out.println("Left Small =>"+leftSmall);
                    }
            }

            // rightLarge = 0;
            // for(int k = j+1; k<A.length; k++)
            // {
            //     if(A[k] > A[j])
            //        {
            //             rightLarge += B[k];
            //             System.out.println("Left Small =>"+rightLarge);
            //        }
            // }
            // System.out.println("LeftSmall => "+leftSmall);
            // System.out.println("Right Large => "+rightLarge);
            // cost = leftSmall+rightLarge;
            // System.out.println("Cost => "+cost);
            // ans = getMin(ans, cost);
        }

        System.out.println("Our Minimum Cost is => "+ans);

    }

    public static int getMin(int current, int previous)
    {
        if(current < previous)
            return current;
        return previous;
    }
}