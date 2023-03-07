package BitManipulation;

public class XORMergeSplit {
    public static void main(String[] args)
    {
        int[] A = {9,17,32};
        int XOR = 0;
        for(int i = 0; i < A.length; i++)
        {
            XOR ^=A[i];
        }

        if(XOR%2 == 0)
            System.out.println("Yes");
        else
            System.out.println("No"); 
        
    }
}
