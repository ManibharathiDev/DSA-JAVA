package Hashing;

import java.util.HashMap;
import java.util.Map.Entry;
public class SubArraySumCheck {

    public static void main(String[] args){
        //int[] A = {2,3,-1,4,-3,10,4};
        int[] A = {1,2,-1,-2,4};
        System.out.println(solve(A));
    }
    
    public static int solve(int[] A) {
        Long[] pf = new Long[A.length];
        pf[0] = (long) A[0];
        for(int i = 1; i < A.length; i++){
            pf[i] = A[i] + pf[i-1]; 
        }
        HashMap<Long,Long> hm = new HashMap<>();
        for(int i = 0; i < A.length; i++)
        {
            if(hm.containsKey(pf[i]))
            {
                Long value = hm.get(pf[i]);
                hm.put(pf[i], value+1);
            }
            else{
                hm.put(pf[i],1L);
            }
        }
        for (Entry<Long, Long> entry : hm.entrySet()) 
        {
                if(entry.getKey() == 0)
                {
                  return 1;
                }
                if(entry.getValue() > 1)
                {
                    return 1;
                }
        }

        return 0;
    }
}
