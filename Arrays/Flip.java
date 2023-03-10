/**
 * Problem Description
You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. By flipping, we mean changing character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.



Problem Constraints
1 <= size of string <= 100000



Input Format
First and only argument is a string A.



Output Format
Return an array of integers denoting the answer.



Example Input
Input 1:

A = "010"
Input 2:

A = "111"


Example Output
Output 1:

[1, 1]
Output 2:

[]


Example Explanation
Explanation 1:

A = "010"

Pair of [L, R] | Final string
_______________|_____________
[1 1]          | "110"
[1 2]          | "100"
[1 3]          | "101"
[2 2]          | "000"
[2 3]          | "001"

We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].
Explanation 2:

No operation can give us more than three 1s in final string. So, we return empty array [].
 */
package Arrays;

import java.util.Arrays;

public class Flip {
    public static void main(String[] args)
    {
        // int[] A = {0,1,0,1,0};
        String A = "010";
        int[] As = new int[A.length()];
         for(int i = 0; i < A.length(); i++)
         {
            As[i] = A.charAt(i)-'0';
         }
         int[] B = As.clone();
         for(int i = 0; i < B.length; i++)
         {
             if(B[i] == 0)
                 B[i] = 1;
             else if(B[i] == 1)
                 B[i] = -1;    
         }
         int leftIndex = 0;
         int maxLength = 0;
         int currLength = 0;
         int currSum = 0;
         int maxSum = -1;
         for (int i = 0; i < B.length; i++) {
             currSum += B[i];
             currLength++;
             if (currSum < 0) {
                 currSum = 0;
                 currLength = 0;
             }
             if (currSum > maxSum) {
                 maxSum = currSum;
                 maxLength = currLength;
                 leftIndex = i - currLength + 1;
             }
         }
         if(maxSum == 0)
             {
                System.out.println("No oper");
                return;
                //return new int[]{};
             }
         int[] ans = new int[]{leftIndex+1, leftIndex+maxLength};
         System.out.println(Arrays.toString(ans));
         //return ans;

        // String A = "01110101";
        // int[] As = new int[A.length()];
        // for(int i = 0; i < A.length(); i++)
        // {
        //     As[i] = A.charAt(i)-'0';  
        // }
        // int[] B = As.clone();
        // for(int i = 0; i < B.length; i++)
        // {
        //     if(B[i] == 0)
        //         B[i] = 1;
        //     else if(B[i] == 1)
        //         B[i] = 0;    
        // }
        // int leftIndex = -1;
        // int rightIndex = -1;
        // int i = 0;
        // int j = B.length-1;
        // System.out.println(Arrays.toString(B));
        // while(i<B.length && j>=0 && i < j)
        // {
        //     if(B[i] == 1 && leftIndex == -1)
        //         leftIndex = i;
        //     if(B[j] == 1 && rightIndex == -1)
        //         rightIndex = i;    
                
        //     i++;
        //     j--;
        // }

        // if(leftIndex != -1)
        // {
        //         As[leftIndex] = 1;
        // }
        // if(rightIndex != -1)
        //     As[rightIndex] = 1;

        // if(leftIndex == -1 && rightIndex == -1)
        //     System.out.println(Arrays.toString(As));
        // else
        //     System.out.println(Arrays.toString(As));
        // System.out.println(leftIndex);
        // System.out.println(rightIndex);
    }


}
