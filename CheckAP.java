import java.util.Arrays;

import javax.lang.model.util.ElementScanner6;

public class CheckAP {
    public static void main(String[] args)
    {
        int[] A = {3,5,1};
        Arrays.sort(A);
        int diff = A[1]-A[0];
        for(int i = 2; i < A.length;i++)
        {
            if(diff != (A[i]-A[i-1]))
            {
                System.out.println("No AP");
                return;
            }
        }
        System.out.println("It is AP");
        
    }
}
