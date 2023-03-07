package Hashing;

import java.util.HashMap;

public class CountFreq {
    public static void main(String[] args){
        int[] A = {3, 3, 3, 9, 0, 1, 0};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < A.length; i++)
        {
            if(hm.containsKey(A[i]))
            {
                int value = hm.get(A[i]);
                hm.put(A[i], value+1);
            }
            else{
                hm.put(A[i],1);
            }
        }

        int count = 0;
        for(int i = 0; i < A.length; i++){
            if(hm.get(A[i]) == 1)
                count++; 
        }

        System.out.println(count);
    }
}
