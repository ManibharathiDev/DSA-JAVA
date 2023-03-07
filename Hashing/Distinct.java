package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class Distinct {
    public static void main(String[] args){
        int[] A = {1, 2, 1, 3, 4, 3};
        int k = 3;
        
        if(k > A.length)
           {
                System.out.println("Not Possible to find");
                return;
           } 
           int[] result = new int[A.length-k+1];   
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < k; i++)
        {
            if(hm.containsKey(A[i]))
            {
                int value = hm.get(A[i]);
                hm.put(A[i], value+1);
            }
            else
                hm.put(A[i],1);
        }
        int j = 0;
        result[j++] = hm.size();
        System.out.println(hm);

        int s = 1;
        int e = k;
        while(e<A.length)
        {  
            if(hm.containsKey(A[s-1]))
            {
                int pValue = hm.get(A[s-1]);
                hm.put(A[s-1],pValue-1);
                System.out.println(hm.get(A[s-1]));
                if(hm.get(A[s-1]) == 0)
                {
                    hm.remove(A[s-1]);
                }
            }
            

            if(hm.containsKey(A[e]))
            {
                int value = hm.get(A[e]);
                hm.put(A[e], value+1);
            }
            else{
                hm.put(A[e], 1);
            }
            System.out.println(" "+hm);
            result[j++] = hm.size();
            s++;
            e++;
        }
        System.out.println(Arrays.toString(result));
    }
}
