package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ZeroSumExisit {
    public static void main(String[] args)
    {
        //bruteForce();
        hashmapCheck();
    }

    public static void hashmapCheck(){
        int[] A = {8,-8,6,0,-6,2,9};
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] pf = new int[A.length];
        int pfsum = 0;
        for(int i = 0; i < A.length; i++)
        {
            pfsum = pfsum + A[i];
            pf[i] = pfsum;
        }
        //System.out.println(Arrays.toString(pf));
        for(int i = 0; i < A.length; i++)
        {
            if(hm.containsKey(pf[i]))
            {
                int value = hm.get(pf[i]);
                hm.put(pf[i],value+1);   
            }
            else
                hm.put(pf[i],1);
        }

        for(int i = 0; i < A.length; i++)
        {
            if(hm.get(pf[i]) == 0)
                {
                    System.out.println("Available");
                    //return;
                }
            else{
                if(hm.get(pf[i]) >= 2)
                {
                    System.out.println("Available");
                    //return;
                }
            }    
        }
        System.out.println(Arrays.toString(pf));
        int count = 0;
        HashMap<Integer,Integer> hms = new HashMap<>();
        hms.put(0, 1);
        for(int i = 0; i < pf.length; i++){
            if(hms.containsKey(pf[i]))
            {
                count += hms.get(pf[i]);
                int value = hms.get(pf[i]);
                value +=1;
                hms.put(pf[i], value);
            }
            else{
                hms.put(pf[i],1);
            }
        }

        System.out.println("Count=>"+count);

        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i< pf.length; i++)
        {
            if(hs.contains(pf[i]))
            {

            }
            else
            {
                
            }
        }



        
    }

    public static void bruteForce(){
        int[] A = {8,-8,6,0,-6,2,9};
        int count = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++)
        {
            int sum = 0;
            
            for(int j = i; j < A.length; j++)
            {
                sum = sum + A[j];
                if(sum == 0)
                    {   
                        int length = j-i+1;
                        System.out.println("length=>"+length);
                        maxLength = getMax(length, maxLength);
                        System.out.println("Yes Zero sums available");
                        count++;
                    }
            }
        }

        System.out.println("Sub array sum is 0 count=>"+count);
        System.out.println("Length=>"+maxLength);
    }

    public static int getMax(int current,int previous)
    {
        if(current > previous)
            return current;
        else
            return previous;
    }
}
