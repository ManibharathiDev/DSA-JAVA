public class Trees {
    public static void main(String[] args)
    {
        int[] A = {1, 6, 4, 2, 6, 9};
        int[] B = {2, 5, 7, 3, 2, 7};
        int minSum = Integer.MAX_VALUE;

        for(int i=1;i<A.length-1;i++)
        {
            int sumL = Integer.MAX_VALUE;
            int sumR = Integer.MAX_VALUE;
            //For LHS of the element
            for(int j=i-1;j>=0;j--)
            {
                int leftSum = B[i];
                if(A[j] < A[i])
                {
                    leftSum = leftSum + B[j];
                    sumL = Math.min(sumL,leftSum);
                }
            }

            //For RHS of the element
            for(int j=i+1; j<A.length;j++)
            {
                int rightSum = 0;
                if(A[j] > A[i])
                {
                    rightSum = rightSum + B[j];
                    sumR = Math.min(sumR,rightSum);
                }
            }
            if(sumL==Integer.MAX_VALUE || sumR == Integer.MAX_VALUE)
                continue;
           
            minSum = Math.min(minSum,sumR+sumL);
        }
        if(minSum==Integer.MAX_VALUE)
            System.out.println("-1");

            System.out.println(minSum);
    }
}
