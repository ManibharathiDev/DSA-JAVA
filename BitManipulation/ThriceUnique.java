package BitManipulation;

import java.util.Arrays;
import java.util.Collections;

public class ThriceUnique{
    public static void main(String[] args)
    {
        int[] A = {3,6,4,4,3,8};
        int[] result = new int[2];
        int v = 0;
        for(int i = 0; i<A.length; i++)
        {
            v ^= A[i];
        }

        int pos = 0;
        for(int bit = 0; bit<=31; bit++)
        {
            if(CheckBit(v, bit) == 1)
            {
                pos = bit;
                break;
            }
        }

        int setBit = 0;
        int unSetBit = 0;
        for(int i = 0; i < A.length; i++)
        {
            if(CheckBit(A[i],pos) == 1)
                {
                    setBit^=A[i];
                    result[0] ^=A[i];
                }
            else
                {
                    unSetBit^=A[i];    
                    result[1] ^=A[i];
                }
        }

        System.out.println("Set Bit =>"+setBit);
        System.out.println("Unset Bit =>"+unSetBit);
        System.out.println("Result=>"+Arrays.toString(result));

        Arrays.sort(A);

       
    }

    private static int CheckBit(int A, int i){
        if(((A>>i)&1) == 1){
            return 1;
        }
        else{
            return 0;
        }
    }
}