package String;

public class LongestPolindrome {
    public static void main(String[] args)
    {
        String A = "MAAAMMMMMA";

        //Brute Force Approach
        // int MAX = Integer.MIN_VALUE;
        // for(int i = 0; i < A.length(); i++)
        // {
        //     for(int j = i; j < A.length(); j++)
        //     {
        //         if(isPalindrome(A, i, j))
        //         {
        //             MAX = getMax(j-i+1, MAX);
        //         }
        //     }
        // }
        // System.out.println(MAX);

        //O N APPROACH
        System.out.println(getMaxPalindromeUsingExpand(A));

        //System.out.println(longestPalindrome(A));
    }

    private static int getMax(int current, int previous)
    {
        if(current > previous)
            return current;
        return previous;    
    }

    private static boolean isPalindrome(String A, int start, int end)
    {

        int i = start;
        int j = end;
        while(i<A.length() && j >= 0)
        {
            if(A.charAt(i) != A.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }


    private static int getPalindromeLength(String A, int start, int end)
    {
        int i = start;
        int j = end;
        while(i>=0 && j<A.length() && (A.charAt(i) == A.charAt(j)))
        {
            i--;
            j++;
        }
        return j-i-1;
    }

    private static int getMaxPalindromeUsingExpand(String A)
    {
        int MAX = Integer.MIN_VALUE;
        for(int i = 0; i < A.length(); i++)
        {
            int len = getPalindromeLength(A, i, i);
            MAX = getMax(len, MAX);
        }

        for(int i = 0; i < A.length()-1; i++)
        {
            int len = getPalindromeLength(A, i, i+1);
            MAX = getMax(len, MAX);
        }

        return MAX;
    }


    public static String longestPalindrome(String A) {
        String len1 = "";
        String len2 = "";
        String longestString = "";
        for (int i = 0; i < A.length(); i++)
        {
            //odd
            len1 = LongestPalinromic(A, i, i);
            if (len1.length() > longestString.length())
                longestString = len1;

            //even
            len2 = LongestPalinromic(A, i, i + 1);
            if (len2.length() > longestString.length())
                longestString = len2;
        }
        return longestString;
    }

    private static String LongestPalinromic(String s, int i, int j)
    {
        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j))
        {
            i--;
            j++;
        }
        return s.substring(i+1, j);//here is the intresting fact, since the while condition fails after i-- and j++,and susstring strats with 1 not 0.so we are adding one for only i.
    }

    
}
