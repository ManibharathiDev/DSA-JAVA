/**
 * Problem Description
Given a non-negative number represented as an array of digits, add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example: for this problem, the following are some good questions to ask :

Q: Can the input have 0's before the most significant digit. Or, in other words, is 0 1 2 3 a valid input?
A: For the purpose of this question, YES
Q: Can the output have 0's before the most significant digit? Or, in other words, is 0 1 2 4 a valid output?
A: For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.


Problem Constraints
1 <= size of the array <= 1000000



Input Format
First argument is an array of digits.



Output Format
Return the array of digits after adding one.



Example Input
Input 1:

[1, 2, 3]


Example Output
Output 1:

[1, 2, 4]


Example Explanation
Explanation 1:

Given vector is [1, 2, 3].
The returned vector should be [1, 2, 4] as 123 + 1 = 124.
 */
package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


class PlusOne{
    public static void main(String[] args)
    {

        //2 5 6 8 6 1 2 4 6 
        ArrayList<Integer> A = new ArrayList<>();
        A.add(0);
        A.add(0);
        A.add(9);
        A.add(0);
        A.add(1);
        // A.add(0);
        // A.add(5);
        // A.add(6);
        // A.add(8);
        // A.add(6);
        // A.add(1);
        // A.add(2);
        // A.add(4);
        // A.add(5);
        

        
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 1;
        
        for(int i = A.size()-1; i>=0; i--)
        {
            int res = A.get(i)+carry;
            
            if(i!=0)
                result.add(res%10);
            if(res >= 10)
            {
                if(i==0)
                {
                    result.add(res%10);
                    result.add(carry);
                }
                carry = 1;  
            }
            else
                {
                    if(i==0)
                    {
                    result.add(res%10);
                    }
                    carry = 0;
                }   

        }
        Collections.reverse(result);
        Iterator<Integer> iterator = result.iterator();  
        int prevElement = 0;
        while (iterator.hasNext())  
        {  
            Integer i = iterator.next();  
            if(i == 0 && prevElement == 0)
                iterator.remove();
            else
                prevElement = 1;    
        }  
                System.out.println(result);
        
        // for(int i = A.length-1; i>=0; i--)
        // {
        //     int res = A[i]+carry;
        //     result[i] = res%10;
        //     if(res >= 10)
        //     {
                
        //         carry = 1;
        //     }
        //     else
        //         carry = 0;

        // }
        //System.out.println(Arrays.toString(result));

        // int[] A = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        // long digit = 0;
        // for(int i = 0; i < A.length; i++)
        // {
        //     digit = (digit*10)+A[i];
        // }

        // System.out.println(digit);

        // digit = digit+1;
        // int[] res = new int[String.valueOf(digit).length()];
        // int i = res.length-1;
        // while(digit > 0)
        // {
        //     long remainder = digit%10;
        //     digit = digit /10;
        //     res[i] = (int) remainder;
        //     i--;
        // }

        // System.out.println(Arrays.toString(res));
    }
}