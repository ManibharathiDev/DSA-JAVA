/**
 * Max Sum Contiguous Subarray

roblem Description
Find the contiguous non-empty subarray within an array, A of length N, with the largest sum.



Problem Constraints
1 <= N <= 1e6
-1000 <= A[i] <= 1000



Input Format
The first and the only argument contains an integer array, A.



Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.



Example Input
Input 1:

 A = [1, 2, 3, 4, -10] 
Input 2:

 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 


Example Output
Output 1:

 10 
Output 2:

 6 


Example Explanation
Explanation 1:

 The subarray [1, 2, 3, 4] has the maximum possible sum of 10. 
Explanation 2:

 The subarray [4,-1,2,1] has the maximum possible sum of 6. 
 */
//Kedane's Alogorithms
package Arrays;

public class MaxSubArraySum {
    public static void main(String[] args)
    {
        int[] A = {5,6,7,-3,2,-1,-10,-12,8,-122,-123};
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < A.length; i++)
        {
            sum += A[i];
            ans = getMax(sum, ans);
            if(sum < 0)
                sum = 0;
        }
        System.out.println(ans);
    }

    private static int getMax(int current, int previous)
    {
        if(current>previous)
            return current;
        return previous;
    }
}
