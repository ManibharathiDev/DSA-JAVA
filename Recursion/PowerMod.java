package Recursion;

public class PowerMod {
    public static void main(String[] args)
    {
        int A = -1;
        int B = 1; 
        int C = 20;
        //System.out.println(Math.pow(A, B)%C);
        System.out.println(pow(A,B,C));
    }

    public static int pow(int A, int B,int C)
    {
        if(A == 0)
            return 0;
        if(A == 1 || B == 0)
        {
            return 1;
        }
        else
        {
            long p = pow(A,B/2,C);
            if(B%2 == 0)
            {
                return (int) ((((p*p)%C)+C)%C);
            }
            else
            {
                return (int) (((((p*p)%C)+C)%C * ((A%C+C)%C))%C);
            }
        }
        
    }
}
