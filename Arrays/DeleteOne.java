package Arrays;

public class DeleteOne {

    public static void main(String[] args)
    {
        
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
