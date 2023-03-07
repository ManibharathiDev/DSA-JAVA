package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class ColorFullNumber {
    public static void main(String[] args){
        int A = 236;
        char[] chars = ("" + A).toCharArray();
        //Find Highest Digit
        int highDigit = Integer.MIN_VALUE;
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < chars.length; i++)
        {
            int prod = 1;
            for(int j = i; j < chars.length; j++){
                prod *= chars[j]-'0';
                if(hs.contains(prod)) 
                {
                    hs.add(prod);
                    System.out.println("Not a colorfull");
                }
                else
                {
                    hs.add(prod);
                }

            }
        }
        System.out.println(hs);

        


        // int As = A;
        // while(As>0)
        // {
        //     //highDigit = getMax(As%10, highDigit);
        //     if(hm.containsKey(As%10))
        //         {
        //             System.out.println("Number available");
        //         }
        //         else{
        //             hm.put(As%10, 1);
        //         }
        //     As = As/10;
            

        // }

        // System.out.println(highDigit);
        // System.out.println(String.valueOf(chars));

        // for(int i = 0; i < chars.length; i++){
        //     int value = chars[i] - '0';
        //     System.out.println(value);
        //     if(value != highDigit || value != 0)
        //     {
        //         if(highDigit%value == 0)
        //         {
        //             System.out.println("Possible");
        //         }
        //     }
        // }

        
    }    

    public static int getMax(int current, int previous)
    {
        if(current > previous)
            return current;
        return previous;    
    }
}
