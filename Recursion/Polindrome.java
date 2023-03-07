package Recursion;

public class Polindrome {
    public static void main(String[] args)
    {
        String A = "NAMANs";
        System.out.println(solve(A));
    }

    private static int solve(String A){
        char[] pol = A.toCharArray();
        return polindrome(pol, 0, pol.length-1);
    }

    private static int polindrome(char[] A, int s, int e){
        if(s >= e)
            return 1;
        if(A[s] != A[e])
            return 0;
        return polindrome(A, s+1, e-1);
    }
}
