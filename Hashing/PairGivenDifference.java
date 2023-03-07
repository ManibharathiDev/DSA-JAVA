package Hashing;

import java.util.HashMap;

public class PairGivenDifference {
    public static void main(String[] args){
            int[] A = {5, 10, 20, 100, 105};
            int B = 110;
            System.out.println(solve(B, A));

    }
    public static int solve(int B,int[] A)
    {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < A.length; i++){
            if(hm.containsKey(A[i]))
            {
                int pValue = hm.get(A[i]);
                hm.put(A[i], pValue+1);
            }
            else
                hm.put(A[i],1);
        }
        //int count = 0;
        for(int i = 0; i < A.length; i++){
            int a = A[i];
            int b = B-a;
            //int b = a-B;
            if(a==b){
                if(hm.get(b) >= 2)
                    {
                        return 1;
                        //count += hm.get(b);
                    }
            }
            else{
                if(hm.containsKey(b))
                    {
                        return 1;
                        //count += hm.get(b);
                    }
            }
        }

        return -1;
    }
}
