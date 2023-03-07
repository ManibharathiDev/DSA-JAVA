package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class ArraySum {
    public static void main(String[] args)
    {
         int[] A = {5,1,2,3,4,5,6,5};
         int sum = 6;
       // int[] A = {1,0,1,0};
        //int sum = 1;
        int ans = 0;
        int[] pf = new int[A.length];
        pf[0] = A[0]+0;
        for(int i = 1; i < A.length; i++)
        {
            pf[i] = A[i] + pf[i-1];
        }
        System.out.println(Arrays.toString(pf));
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for(int i = 0; i < pf.length; i++)
        {
            if(hm.containsKey(pf[i]))
            {
                int value = hm.get(pf[i])+1;
                hm.put(pf[i], value);
            }
            else{
                hm.put(pf[i], 1);
            }
        }

        for(int i = 0; i< pf.length; i++)
        {
            int sums = pf[i]-sum;
            if(hm.containsKey(sums))
            {
                //ans++;
                ans += hm.get(sums);
            } 
        }

        System.out.println(hm);
        System.out.println(ans);
        
    }
}
