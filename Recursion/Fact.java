package Recursion;

public class Fact {
    public static void main(String[] args){
        int A = 12;
        System.out.println(solve(A));
    }

    private static int solve(int A){
        return fact(A);
    }

    private static int fact(int A)
    {
        if(A == 0)
            return 0;
        if(A == 1)
            return 1;
        return fact(A-1)*A;        
    }
}
