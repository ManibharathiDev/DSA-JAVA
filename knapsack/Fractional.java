package knapsack;

import java.util.Arrays;
import java.util.Collections;

public class Fractional
{

    

    public static void main(String[] args)
    {
        int[] h = {3,8,10,2,5};
        int[] w = {10,4,20,8,15};
        int c = 40;

        float[] N = new float[h.length];
        
        for(int i = 0; i < h.length; i++)
        {
            N[i] = ((float)h[i])/w[i];
            System.out.println(N[i]);
        }

        
        Arrays.sort(N);
        reverse(N);

        for(int i = 0; i < h.length; i++)
        {
            
            System.out.println(N[i]);
        }

        int happiness = 0;
        for(int i = 0; i<h.length; i++)
        {
            if()
        }


    }

    public static void reverse(float[] array)
    {
 
        // Length of the array
        int n = array.length;
 
        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {
 
            // Storing the first half elements temporarily
            float temp = array[i];
 
            // Assigning the first half to the last half
            array[i] = array[n - i - 1];
 
            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }
    }
}