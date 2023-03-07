package Arrays;

import java.util.HashMap;

public class Nthree {
    public static void main(String[] args)
    {
        int[] A = {1,2,3,1,1,3,3,3};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < A.length; i++)
        {
            if(hm.containsKey(A[i]))
            {
                hm.put(A[i],hm.get(A[i])+1);
            }
            else
                hm.put(A[i],1);
        }

        for(Integer key: hm.keySet()) 
        {
            if(hm.get(key) > A.length/3)
            {
                System.out.println(key);
            }
        }
    }
}
