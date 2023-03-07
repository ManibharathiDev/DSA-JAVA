package Hashing;

import java.util.HashMap;

public class Dicitionary {
    public static void main(String[] args)
    {
         String[] A = {"hello","scaler","interviewbit"};
         String B = "adhbcfegskjlponmirqtxwuvzy";
        System.out.println(isDicitionary(A, B));
    }

    private static int isDicitionary(String[] A, String B)
    {

        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < B.length(); i++)
        {
            hm.put(B.charAt(i), i);
        }

        for(int i = 0; i < A.length-1; i++)
        {
                if(A[i].length() > A[i+1].length())
                    return 0;
                int j = 0;
                while(hm.get(A[i].charAt(j)) == hm.get(A[i+1].charAt(j)))
                {
                        j++;
                }
                if(hm.get(A[i].charAt(j)) > hm.get(A[i+1].charAt(j)))
                {
                    return 0;
                }
        }
        return 1;
    }

}
