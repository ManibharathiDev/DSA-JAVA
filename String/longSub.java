package String;

public class longSub {
    public static void main(String[] args)
    {
        int[] A = {16,3,3,6,7,8,17,13,7};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        
        int MAX = Integer.MIN_VALUE;
        int len = 0;
        int i = 0;
        while(i < A.length)
        {
            len = 0;
            for(int j=i; j < A.length-1; j++)
            {
                
                if(A[j] <= A[j+1])
                {
                len++;
                }
                else
                    break;
                
            }
            i++;
            MAX = getMax(len, MAX);
        }

        
        return MAX;
        
    }
    
    private static int getMax(int current, int previous)
    {
        if(current > previous)
        {
            return current;
        }
        return previous;
    }
}
