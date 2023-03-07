package Recursion;

public class IsMagic {
    public static void main(String[] args)
    {
        System.out.println(isMagic(835572));
    }

    public static int isMagic(int A)
    {


         if(A < 10)
         {
                if(A == 1)
                    return A;
                else
                    return 0;    
         }
            
         int rem = 0;
         int sum = 0;
         while(A>0)
         {
            rem = A%10;
            sum = sum + rem;
            A = A/10;
         }
         System.out.println(sum);
       return isMagic(sum);
        //return 0;
        
    }

}
