package Recursion;

public class SumOfDigits {
    public static void main(String[] args){
        System.out.println(sum(1000));
    }

    private static int sum(int A){
        if(A == 0)
        {
            return A; 
        }
        int sums = A%10;
        A = A/10;
        return sum(A)+sums;

    }
}
