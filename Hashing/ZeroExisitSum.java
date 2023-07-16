package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class ZeroExisitSum {
    public static void main(String[] args)
    {
      int[] A = {-1,1};
      System.out.println(solve(A));
      
    }

    private static int solve(int[] A)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] pf = new int[A.length];
        long pfsum = 0;
        long mod = 1000000007;
        for(int i = 0; i < A.length; i++)
        {
            pfsum = pfsum+A[i];
            pf[i] = (int) (pfsum%mod);

            if(pfsum == 0)
                return 1;

        }
        System.out.println(Arrays.toString(pf));
        
        for(int i = 0; i < A.length; i++)
        {


            if(hm.containsKey(pf[i]))
            {
                int value = hm.get(pf[i]);
                hm.put(pf[i],value+1);   
            }
            else
                hm.put(pf[i],1);
        }
        System.out.println(hm.toString());
        for(int i = 0; i < A.length; i++)
        {
            if(hm.get(pf[i]) == 0)
                {
                    return 1;
                }
            else{
                if(hm.get(pf[i]) >= 2)
                {
                    return 1;
                }
            }    
        }
  
        return 0;
    }
}
