package Hashing;

import java.util.HashMap;

public class CountSubArraySum {
    public static void main(String[] args){
        // int[] A = {30,-30,30,-30};
        int[] A = {8,-8,6,0,-6,2,9};
        int count = 0;
        Long[] pf = new Long[A.length];
        pf[0] = (long) A[0];
        for(int i = 1; i < A.length; i++){
            pf[i] = A[i] + pf[i-1]; 
        }
        HashMap<Long,Long> hm = new HashMap<>();
        hm.put(0L,1L);
        for(int i = 0; i < A.length; i++)
        {
            if(hm.containsKey(pf[i]))
            {
                Long value = hm.get(pf[i]);
                count += value;
                hm.put(pf[i], value+1);
            }
            else{
                hm.put(pf[i],1L);
            }
        }
        System.out.println(hm);
        System.out.println(count);
        }
}
