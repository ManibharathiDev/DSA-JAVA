package Modular;

public class DivisibleByEight {
    public static void main(String[] args)
    {
        String A = "1216";

        int num = 0;
        int s = 0;
        int e = A.length();
        if(A.length() > 3)
        {
            s = (A.length())-3;
        }

        for(int i = s; i<e; i++)
        {
            int digit = A.charAt(i)-'0';
            num = num*10+digit;
        }

        if(num%8 == 0)
            System.out.println("It should divisible by 8");
        else
            System.out.println("It is not");    

        
    }

}
