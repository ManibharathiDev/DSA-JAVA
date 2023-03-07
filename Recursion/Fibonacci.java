package Recursion;

public class Fibonacci {
    public static void main(String[] args){
        int A = 0;
        System.out.println(solve(A));
    }

    public static int solve(int A) {
        return fib(A);

    }

    public static int fib(int A)
    {
        if(A == 0)
            return 0;
        if(A == 1 || A == 2)
            return 1;
        return fib(A-1) + fib(A-2);
    }


}
