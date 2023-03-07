import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args)
    {
        int[] A = {1,2,3,4,5};
        int[] B = {2,3};
        // int[] A = {6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54, 67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47};
        // int[] B =  {88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75, 82, 17, 23, 67, 51, 23, 11, 70, 59};
        int[][] result = new int[B.length][A.length];
        
        for(int i = 0; i < B.length; i++)
        {
            // int k = B[i]%A.length;
            int k = 3;
            int[] reverseArray = swapArray(0, A.length-1, A);
            System.out.println("Reverse Array =>"+Arrays.toString(reverseArray));
            result[i] = swapArray(0, k, reverseArray);
            System.out.println("First Part =>"+Arrays.toString(result[i]));
            result[i] = swapArray(k+1, A.length-1, result[i]);
            System.out.println("Rotated Array =>"+Arrays.toString(result[i]));
           
        }
    }

    public static int[] swapArray(int startRange, int endRange, int[] A){

        int i = startRange;
        int j = endRange;
        int[] B = A.clone();
        while(i<=j)
        {
            int temp = A[i];
            B[i] = A[j];
            B[j] = temp;
            i++;
            j--;
        }
        return B;
    }
}
