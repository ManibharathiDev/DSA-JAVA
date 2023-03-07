//Rain Water Trapped
/**
 * Problem Description
Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.



Problem Constraints
1 <= |A| <= 100000



Input Format
First and only argument is the vector A



Output Format
Return one integer, the answer to the question



Example Input
Input 1:

A = [0, 1, 0, 2]
Input 2:

A = [1, 2]


Example Output
Output 1:

1
Output 2:

0


Example Explanation
Explanation 1:

1 unit is trapped on top of the 3rd element.
Explanation 2:

No water is trapped.
 */
package Arrays;

import java.util.Arrays;

public class RainWaterTrapped {
    public static void main(String[] args)
    {
        int[] A = {4,2,5,7,4,2,3,6,8,2,3};
        int[] lMax = new int[A.length];
        lMax[0] = A[0];
        for(int i = 1; i < A.length; i++)
        {
            lMax[i] = getMax(A[i], lMax[i-1]);
        }
        System.out.println(Arrays.toString(lMax));

        int[] rMax = new int[A.length];
        rMax[A.length-1] = A[A.length-1];
        for(int i = A.length-2; i >=0; i--)
        {
            rMax[i] = getMax(A[i], rMax[i+1]);
        } 
        System.out.println(Arrays.toString(rMax));
        int ans = 0;
        for(int i = 1; i < A.length-1; i++)
        {
            int sLeft = lMax[i-1];
            int sRight = rMax[i+1];
            int netSupport = getMin(sLeft, sRight);
            int water = getMax(netSupport-A[i], 0);
            ans+= water;
        }
        System.out.println(ans);


    }

    private static int getMin(int current, int previous)
    {
        if(current<previous)
            return current;
        return previous;
    }

    private static int getMax(int current, int previous)
    {
        if(current > previous)
            return current;
        return previous;
    }
}
