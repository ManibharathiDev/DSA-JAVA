public class CountOnBits {
    public static void main(String[] args){
        int A = 6;
        //return checkBit(A);
        System.out.println(checkBit(A));
    }

    public static int checkBit(int A)
    {
        int c = 0;
        while(A>0)
        {
            if((A&1) == 1)
                c++;
            A = A>>1;    
        }
        return c;
    }
}
