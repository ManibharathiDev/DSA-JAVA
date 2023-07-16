package Arrays;

public class GCD{
    public static void main(String[] args)
    {
        int A = 4;
        int B = 6;
        System.out.println(solve(A, B));
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