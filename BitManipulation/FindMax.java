/**
 * Maximum AND PAIR
 * Problem Description
Given an array A. For every pair of indices i and j (i != j), find the maximum A[i] & A[j].


Problem Constraints
1 <= len(A) <= 105
1 <= A[i] <= 109


Input Format
The first argument is an integer array A.


Output Format
Return a single integer that is the maximum A[i] & A[j].


Example Input
Input 1:-
A = [53, 39, 88]
Input 2:-
A = [38, 44, 84, 12] 


Example Output
Output 1:-
37
Output 2:-
36


Example Explanation
Explanation 1:-
53 & 39 = 37
39 & 88 = 0
53 & 88 = 16
Maximum among all these pairs is 37
Explanation 2:-
Maximum bitwise and among all pairs is (38, 44) = 36
 */
package BitManipulation;

public class FindMax {
    public static void main(String[] args)
    {
        int[] A = {53, 39, 88};
        int ans = 0;
        for(int bit = 31; bit >=0 ; bit--)
        {
            int c = 0;
            for(int i = 0; i<A.length;i++)
            {
                if(CheckBit(A[i], bit) == 1)
                {
                    c++;
                }
            }

            if(c>=2)
            {
                ans += 1<<bit;
                for(int i = 0; i < A.length; i++){
                    if(CheckBit(A[i], bit) == 0)
                    {
                        A[i] = 0;
                    }
                }
            }
        }

        System.out.println(ans);
    }

    private static int CheckBit(int A, int i){
        if(((A>>i)&1) == 1){
            return 1;
        }
        else{
            return 0;
        }
    }
}
