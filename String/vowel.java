package String;

import java.util.Arrays;

public class vowel
{
    public static void main(String[] args)
    {
        String A= "eaucqt";
        int[][] B= {{0,2}};
        System.out.println(Arrays.toString(solve(A,B)));
    }

    public static int[] solve(String A, int[][] B) {
        int[] vowel = new int[A.length()];
        for(int i=0; i<A.length(); i++)
        {
                char vowels = A.charAt(i);
                if(vowels == 'a' || vowels == 'e' || vowels == 'i' || vowels == 'o' || vowels == 'u')
                {
                    vowel[i] = 1;
                }
                else
                    vowel[i] = 0;
        }
        int[] pf = new int[A.length()];
        pf[0] = vowel[0];
        for(int i = 1; i<vowel.length; i++)
        {
            pf[i] = vowel[i]+pf[i-1];
        }
        System.out.println(Arrays.toString(pf));
        int[] res = new int[B.length];
        for(int i = 0; i < B.length; i++)
        {
            int s = B[i][0];
            int e = B[i][1];
            System.out.println(e);
            if(s == 0)
                res[i] = e;
            else
                res[i] = pf[e]-pf[s-1];
        }
        
        // for(int i = 0; i < B.length; i++)
        // {
        //     int vCount = 0;
        //     for(int j = B[i][0]; j<= B[i][1]; j++)
        //     {
        //         char vowel = A.charAt(j);
        //         if(vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u')
        //         {
        //             vCount++;
        //         }
        //     }
        //     res[i] = vCount;
        // }
        return res;
    }
}