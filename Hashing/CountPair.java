package Hashing;

import java.util.HashMap;

public class CountPair {
    
    public static void main(String[] args)
    {
        
        System.out.println(findPair());

    }

    public static int findPair(){
        int[] B = {3, 5, 1, 2};
        int A = 3;
        int count = 0;

        //Create Frequence HM
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < B.length; i++){
            if(hm.containsKey(B[i]))
            {
                int pValue = hm.get(B[i]);
                hm.put(B[i], pValue+1);
            }
            else
                hm.put(B[i],1);
        }
        System.out.println("Freq =>"+hm);

        for(int i = 0; i < B.length; i++){
            int a = B[i];
            int b = A-a;
            if(a==b){
                if(hm.get(b) >= 2)
                    {
                        //return 1;
                        count += 1;
                    }
            }
            else{
                if(hm.containsKey(b))
                    {
                        //return 1;
                        count += 1;
                    }
            }
        }

        return count;
    }
    
}
