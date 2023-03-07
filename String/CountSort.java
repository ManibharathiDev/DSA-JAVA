package String;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSort {
    public static void main(String[] args){

        int[] A = {10,9,8};
        int[] result = new int[A.length];
        
        int MAX = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++)
        {
            MAX = getMax(A[i], MAX);
        }
        
        int[] res = new int[MAX+1];
        
        for(int i = 0; i < res.length; i++)
        {
            res[i] = 0;
        }

        for(int i = 0; i < A.length; i++)
        {
            int idx = A[i];
            res[idx]++;
        }

        int k = 0;
        for(int i = 0; i < res.length; i++)
        {
            for(int j = 0; j < res[i]; j++)
            {
                System.out.println(i);
                result[k++] = i;
            }
        }

        System.out.println(Arrays.toString(result));

    }

    private static int getMax(int current, int previous)
    {
        if(current>previous)
            return current;
        return previous;
    }
}
