package Arrays;
import java.util.Arrays;
import java.util.HashSet;

public class FindFirstMissNatural{
    public static void main(String[] args)
    {
        int[] A = {-2,-3,-4,1,5,6,7,8};
        //Brute Force
        /*HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < A.length; i++)
        {
            if(A[i]>0)
                hs.add(A[i]);
        }

        for(int i = 1; i < A.length+1; i++)
        {
            if(!hs.contains(i))
            {
                System.out.println("The ans is =>"+i);
                break;
            }
        }*/
        //Brute Force End TC = O(N) and SC is O(N)

        for(int i = 0; i < A.length; i++)
        {
            while(A[i]>=1 && A[i] <=A.length && A[i] != i+1)
            {
                int val = A[i];
                if(A[i] == A[val-1])
                {
                    break;
                }
                else
                {
                    int temp = A[i];
                    A[i] = A[val-1];
                    A[val-1] = temp;
                }
                //System.out.println(Arrays.toString(A));
            }
        }
        //System.out.println(Arrays.toString(A));

        for(int i = 0; i < A.length; i++)
        {
            // if(i+1 != A[i])
            // {
            //     System.out.println((i+1));
            //     break;
            // }

            if(A[i]-1 != i)
            {
                System.out.println((i+1));
                 break;
            }    
        }


    }
}