public class MinSwap {
    public static void main(String[] args) {
        // int[] A = {1,12,10,3,14,10,5};
        // int B = 8;
        int[] A = {52,7,93,47,68,26,51,44,5,41,88,19,78,38,17,13,24,74};
        int B = 19;
        int swap = 0;

        for(int i = 0; i < A.length; i++)
        {
            if(A[i]>B)
            {
                int j = i;
                while(i<A.length && A[i]>B)
                {
                    i++;
                }
                if(i<A.length)
                {
                    int temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                    swap++;
                    i = j;
                }
            }
        }
        System.out.println(swap);
    }
}
