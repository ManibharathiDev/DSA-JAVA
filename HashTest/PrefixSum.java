package HashTest;

import java.util.Arrays;
import java.util.HashMap;

public class PrefixSum {
    public static void main(String[] args)
    {
        int[] A = {0,2,3,5,0,1,6,2};
        int[] pf = new int[A.length+1];
        int[] pfs = new int[A.length];
        pf[0] = 16;
        for(int i = 0; i < A.length; i++)
        {
            pf[i+1] = A[i] + pf[i];
        }
        System.out.println(Arrays.toString(pf));

        pfs[0] = A[0];
        for(int i = 1; i < A.length; i++)
        {
            pfs[i] = A[i] + pfs[i-1];
        }

        //System.out.println(Arrays.toString(pfs));
        int ans = 0;
       
        // for(int i = 0; i < A.length; i++)
        // {
        //     for(int j = 1; j < A.length; j++)
        //     {
        //         if(i == 0)
        //         {    if(pfs[j] == k)
        //                 ans++;
        //         }        
        //         else
        //         {    
        //             //System.out.println(i+"-"+j+" is"+(pfs[j]-pfs[i-1]));
        //             if(pfs[j]-pfs[i-1] == 7)
        //             {
        //                 ans++;
        //             }
        //         }
        //     }
        // }

    //     int ans = 0, sum0_i = 0;
    // for (int i = 0; i < n; i++) {
    //     sum0_i += nums[i];
    //     // this is the prefix sum we want to find nums[0..j]
    //     int sum0_j = sum0_i - k;
    //     // if it exists, we'll just update the result
    //     if (preSum.containsKey(sum0_j))
    //         ans += preSum.get(sum0_j);
    //     // record the prefix sum nums[0..i] and its frequency
    //     preSum.put(sum0_i, 
    //         preSum.getOrDefault(sum0_i, 0) + 1);
    // }
    int k = 5;
        HashMap<Integer,Integer> hm = new HashMap<>();
        //int[] p = new int[A.length+1];
        hm.put(0, 1);
        int sums = 0;
        for(int i = 0; i < A.length; i++)
        {
            sums += A[i];
            int sum_j = sums-k;
            if(hm.containsKey(sum_j))
            {
                ans += hm.get(sum_j);
            }
            if(hm.containsKey(sums))
            {
                hm.put(sums, hm.get(sums)+1);
            }
            else
                hm.put(sums, 1);
            //   if(i == 0)
            //   {
            //     if(pfs[i] == k)
            //         ans++;
            //   }  
            //   else
            //   {
            //     if(pfs[i-1] == pfs[i]-k)
            //         ans++;
            //   }
        }

        System.out.println(ans);


    }
}
