package Hashing;

import java.util.HashMap;
import java.util.Map;

public class ArraySumLenght {
    public class Solution {
        public int solve(int[] A) {
        Map<Long,Integer> map = new HashMap();
        long sum = 0;
        int length = 0;
        for(int i=0;i<A.length;i++) 
        {
            sum = sum+A[i];
            //when prefix is 0, length should be index+1
            if(sum==0) 
            {
                length = i+1;
             }
            if(map.containsKey(sum)) 
            {
                length = Math.max(length, i-map.get(sum));
            } 
            else 
            {
                map.put(sum,i);
            }
        }
        return length;
        
        }
        }
}
