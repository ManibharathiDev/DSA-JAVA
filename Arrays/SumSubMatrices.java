package Arrays;

class SumSubMatrices{
    public static void main(String[] args)
    {
        int sum = 0;
        int[][] A= {{1,1},{1,1}};
        for(int i = 0; i < A.length;i++)
        {
            for(int j = 0; j < A.length; j++)
            {

//                 int topLeft = (i + 1) * (j + 1);
// int bottomRight = (A.length-1 - i) * (A.length - j);
// sum += A[i][j] * topLeft * bottomRight;
                sum += A[i][j] * ((i+1)*(j+1))*((A.length-i)*(A.length-j));
            }
        }
        System.out.println(sum);
    }
}