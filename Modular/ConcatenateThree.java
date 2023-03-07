package Modular;

import java.util.Arrays;

public class ConcatenateThree {
    public static void main(String[] args)
    {
        int A = 55;
        int B = 43;
        int C = 10;

        int MIN = Math. min(Math. min(A,B),C);
        int MAX = Math.max(Math.max(A, B), C);
        int MID = (A+B+C) - (MAX+MIN);
        System.out.println(String.valueOf(MIN)+String.valueOf(MID)+String.valueOf(MAX));
        // int[] Arr = new int[3];
        // Arr[0] = A;
        // Arr[1] = B;
        // Arr[2] = C;
        // Arrays.sort(Arr);
        // String result = "";
        // for(int i = 0; i < Arr.length; i++)
        // {
        //     result +=Arr[i];
        // }
        // System.out.println(result);

    }
}
