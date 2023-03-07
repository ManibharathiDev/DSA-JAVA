package Recursion;

public class Power {
    public static void main(String[] args)
    {
        int A = 2;
        int B = 10; 
        int C = 3;
        System.out.println(pow(A,B));
    }

    public static int pow(int A, int B)
    {
        if(A == 1 || B == 0)
        {
            return 1;
        }
        else
        {
            int p = pow(A,B/2);
            if(B%2 == 0)
            {
                return p * p;
            }
            else
            {
                return p * p * A;
            }
        }
        
    }
}
