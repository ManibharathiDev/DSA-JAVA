public class Negative{
    public static void main(String[] args)
    {
        int[] A = {-3674875, -9, -1, 205505,6,7,8,8, -7168198,205505,6,7,8, -1398091, 5392310, -1700856, 1259052, -3056006,205505,6,7,8,1};
        //int[] A = {8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575 };
        //int[] A = {5, 6, -1, 7, 8};
        //int[] A = {0,0,0,0,0,0,0,0};
        
        int count = 0;
        int max = Integer.MIN_VALUE;
        int endIndex = -1;
        int startIndex = -1;
        for(int i = 0; i < A.length; i++)
        {
            if(A[i]>= 0)
            {
                count++;
                if(i == A.length-1)
                {
                    if(count != 0 && count > max)
                    {
                        endIndex = i;
                        startIndex = i-count+1;
                        max = count;
                    }
                }
            }
            else{
                    if(count != 0 && count > max)
                    {
                        endIndex = i-1;
                        startIndex = i-count;
                        max = count;
                    }
                  count = 0;
            }
        }
        if(count == A.length)
        {
               startIndex = 0;
               endIndex = A.length-1;
         }
        int[] B = new int[endIndex-startIndex+1];   
        int j = 0; 
        for(int i = startIndex; i <= endIndex; i++)
        {   
                B[j++] = A[i];
        }
        //return B;
        
        System.out.println("Count of Max=>"+max);
        System.out.println("End Index=>"+endIndex);
        System.out.println("Start Index=>"+startIndex);
    }

    public static int getMax(int current, int previous)
    {
        if(current > previous)
            return current;
        return previous;
    }
}