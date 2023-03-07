package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class SubArraySum {

    public static void main(String[] args){
        int[] A = {30, -30, 30, -30};
        //int[] A = {-1, 8, -4, 7, -4, 0, -8, -2, -7 };
        //int[] A = {0};

        int count = 0;
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

        System.out.println(hm);

        for (Entry<Long, Long> entry : hm.entrySet()) 
        {
                if(entry.getKey() == 0 || entry.getValue() > 1)
                {
                   System.out.println("Sums 0");
                   //count += entry.getValue();
                }
                // else if(entry.getValue() > 1)
                //  {
                //      System.out.println("Sum 0");
                //      count += entry.getValue();
                // }
        }
        System.out.println(count);

    }
}
