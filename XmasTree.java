public class XmasTree {
    public static void main(String[] args){
        int[] A = {1, 6, 4, 2, 6, 9};
        int[] B = {2, 5, 7, 3, 2, 7};
        int lmin = Integer.MAX_VALUE;
        int rmin = Integer.MAX_VALUE;
        for(int j = 1; j < A.length; j++)
        {
            int leftMin = 0;
            int rightMax = 0;
            for(int i = j-1; i >= 0; i++)
            {
                if(A[j] < A[i])
                    {
                        leftMin = B[j]+B[i];
                        lmin = getMin(leftMin, lmin);
                    }
            }

            for(int i = j+1; j < A.length; j++){
                if(A[i] > A[j])
                {
                    rightMax = B[i]+B[j];
                    rmin = getMin(leftMin, rmin);
                }
            }
        }
    }

    public static int getMin(int current, int previous){
        if(current < previous)
            return current;
        return previous;    
    }
}
