package BitManipulation;

public class Recursive {
    public static void main(String[] args)
    {
        print1To10(5);
    }

    public static void print1To10(int A)
    {
        if(A == 0)
            return;
        ;      
        print1To10(A-1);   
        System.out.println(A); 
        
    }

    public static void print1To10Odd(int A)
    {
        if(A == 1)
        {
            System.out.println(A);   
            return;
            
        }

        if(A<=0)
            return;
        System.out.println(A);     
        print1To10Odd(A-2);   
       
    }
}
