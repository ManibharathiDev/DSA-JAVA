package Arrays;

import java.util.HashMap;

import javax.lang.model.util.ElementScanner6;

public class PairSum {
    public static void main(String[] args)
    {
        // int[] A = {2,3,3,5,7,7,8,9,9,10,10};
        int[] A = {1,1,1,2,2,3,4,5,6,7,8,9};
        int B = 2;
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int k = 0; k < A.length; k++)
        {
            if(hm.containsKey(A[k]))
            {
                int value = hm.get(A[k]);
                hm.put(A[k],value+1);
            }
            else{
                hm.put(A[k],1);
            }
        }
        System.out.println(hm.toString());
        int i = 0;
        int j = A.length-1;
        int count = 0;
        while(i<j)
        {
            int sum = A[i]+A[j];
            if(sum == B)
            {
                if(A[i] == A[j])
                {
                    int fre = hm.get(A[i]);
                    int c = (fre*(fre-1))/2;
                    count += c;
                }
                else    
                    count += hm.get(A[i])*hm.get(A[j]);
                i = i+hm.get(A[i]);
                j = j-hm.get(A[j]);
            }
            else if(sum < B)
            {
                //i++;
                i = i+hm.get(A[i]);
                //j = j-hm.get(A[j]);
            }
            else{
                //j--;
                //i = i+hm.get(A[i]);
                j = j-hm.get(A[j]);
            }
        }
        System.out.println(count);
    }
}
