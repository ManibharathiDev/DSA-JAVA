import java.util.Arrays;

// Left Rotate Array
public class ArrayRotate {
    public static void main(String[] args)
    {
        int[] A = {1,2,3,4,5};
        int[] B = {2,3};
        // int[] A = {5, 17, 100, 11};
        // int[] B = {1};
        int[][] result = new int[B.length][A.length];
        for(int i = 0; i < B.length; i++)
        {
            int[] copyofA = A.clone();
            arrayReverse(0,copyofA.length-1,copyofA);
            int k = B[i]%copyofA.length;
            //First Part Reverse
            arrayReverse(0, copyofA.length-k-1, copyofA);
            //Second Part Reverse
            //System.out.println(Arrays.toString(arrayReverse(copyofA.length-k, copyofA.length-1, copyofA)));
            result[i] = arrayReverse(copyofA.length-k, copyofA.length-1, copyofA);
            System.out.println(Arrays.toString(result[i]));
        }
    }

    private static int[] arrayReverse(int startRange, int endRange, int[] arr)
    {
        int i = startRange;
        int j = endRange;
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
