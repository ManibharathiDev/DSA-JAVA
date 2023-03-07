package Hashing;

import java.util.Arrays;
import java.util.HashMap;

import javax.lang.model.util.ElementScanner6;

import org.xml.sax.HandlerBase;

public class SubArraySumGiven {
    public static void main(String[] args){
        int[] A = {1,2,3,4,5};
        int B = 5;
        //System.out.println(solves(A, B));
        //solves(A, B);
        int[] result = hashing(A, B);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solves(int[] A, int B){
        int l = 0;
        int r = 0;
        int sum = A[l];
        while(r<A.length && l<=r){
            if(sum == B)
            {
                
                int[] arr = new int[r-l+1];
                int index = -1;
                for(int i = l; i<=r; i++)
                {
                    //System.out.print(A[i]+" ,");
                    arr[++index] = A[i];
                }
                return arr;
            }
            else if(sum < B)
            {
                r++;
                if(r<A.length)
                    sum += A[r];
            }
            else{
                sum -= A[l];
                l++;
                if(l>r && l< A.length-1)
                {
                    r++;
                    sum += A[r];
                }
            }
        }
        
        return new int[]{-1};
    }

    public static int hashing(int[] A, int B){
        HashMap<Long,Integer> hm = new HashMap<>();
        long sum = 0;
        hm.put(0l, -1);
        for(int i = 0; i < A.length; i++)
        {
            sum += A[i];
            if(hm.containsKey(sum-B)){
                int[] arr = new int[i-hm.get(sum-B)];
                int index = 0;
                for(int j = hm.get(sum-B); j<=i; j++)
                {
                    arr[index++] = A[j];
                    System.out.print(A[j]+" ");
                }
            }
            else if(!hm.containsKey(sum)){
                hm.put(sum, i);
            }
        }
        return 0;
    }



    public static int solve(int[] A, int B){
        for(int i =0; i < A.length; i++)
        {
            int sum = 0;
            for(int j = i; j < A.length; j++)
            {
                sum += A[j];
                if(sum == B)
                    return 1;
            }
        }
        return 0;
    }
}
