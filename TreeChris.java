public class TreeChris{
    public static void main(String[] args)
    {

        int A[] = { 5, 9, 10, 4, 7, 8 };
        int B[] = { 5, 6, 4, 7, 2, 5 };
        // int[] A = {1, 6, 4, 2, 6, 9,15};
        // int[] B = {2, 5, 7, 3, 2, 7,1};
        int leftMin = Integer.MAX_VALUE;
        int rightMin = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        for(int j = 1; j<A.length-1; j++)
        {
            int leftSum = Integer.MAX_VALUE;
            int rightSum = Integer.MAX_VALUE;
            leftMin = Integer.MAX_VALUE;
            rightMin = Integer.MAX_VALUE;
            for(int i = j-1; i >=0; i--)
            {
                //leftSum = B[j];
                if(A[i] < A[j])
                {
                    leftSum =  B[i]+B[j];
                    leftMin = getMin(leftSum, leftMin);
                }
                
                
            }

            
            for(int i = j+1; i < A.length; i++)
            {
                //rightSum = Integer.MAX_VALUE;
                if(A[i] > A[j])
                {
                    rightSum = B[i];
                    rightMin = getMin(rightSum, rightMin);
                }
            }
            System.out.println("Left Min Sum =>"+leftMin);
            System.out.println("Right Min Sum =>"+rightMin);

            if(leftSum == Integer.MAX_VALUE || rightSum == Integer.MAX_VALUE)
                continue;

            int totalCost = leftMin+rightMin;
            ans = getMin(totalCost, ans);
        }
        if(ans == Integer.MAX_VALUE)
        System.out.println("Answer is =>"+ans);
    }

    private static int getMin(int current, int previous)
    {
        if(current < previous)
            return current;
        return previous;
    }
}