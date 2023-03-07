public class UnSetBit {
    public static void main(String[] args){
        int A = 4;
        int B = 1;
        System.out.println(A&~(1<<B));
        //System.out.println(A^1);
         if(((A>>B)&1) == 1)
         {
             //System.out.println(A&1);
             System.out.println((A^1));
         }
         else
             System.out.println(A);
    }
}
