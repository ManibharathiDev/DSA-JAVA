package Recursion;

public class KThHard{
    public static void main(String[] args)
    {
        int A = 5;
        long B = 3;
        System.out.println(solve(A,B));
    }
    public static int solve(int A, long B) {
        if(A == 1 && B == 0) return 0;
       long mid = (long) Math.pow(2, A -1) / 2;

       if( B < mid) {
           return solve(A-1, B);
       }else {
           return solve(A-1, B - mid) ^ 1;
       }
   }
}