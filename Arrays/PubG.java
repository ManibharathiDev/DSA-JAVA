package Arrays;

public class PubG {

    public static void main(String[] args)
    {
        int[] A = {2,3,4};
        int gcd = 0;
        for(int i = 0; i < A.length; i++)
        {
            gcd = solve(gcd,A[i]);
        }
        System.out.println(gcd);
    }

    static int solve(int A, int B)
    {
        if(A == 0)
            return B;
        if(B == 0)
            return A;
        return solve(B,A%B);
    }
}
