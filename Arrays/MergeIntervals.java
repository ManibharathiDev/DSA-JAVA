/**
 * Merge Intervals
 * Problem Description
Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.



Problem Constraints
0 <= |intervals| <= 105



Input Format
First argument is the vector of intervals

second argument is the new interval to be merged



Output Format
Return the vector of intervals after merging



Example Input
Input 1:

Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
Input 2:

Given intervals [1, 3], [6, 9] insert and merge [2, 6] .


Example Output
Output 1:

 [ [1, 5], [6, 9] ]
Output 2:

 [ [1, 9] ]


Example Explanation
Explanation 1:

(2,5) does not completely merge the given intervals
Explanation 2:

(2,6) completely merges the given intervals
 */
import java.util.ArrayList;

import javax.lang.model.util.ElementScanner6;

public class MergeIntervals{
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        ArrayList<Integer> element = new ArrayList<>();
        element.add(1);
        element.add(3);
        A.add(element);

        element = new ArrayList<>();
        element.add(6);
        element.add(9);
        A.add(element);

        //System.out.println(A);

        ArrayList<Integer> B = new ArrayList<>();
        B.add(2);
        B.add(5);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < A.size(); i++)
        {
            if(A.get(i).get(1) < B.get(0))
            {
                ArrayList<Integer> res = new ArrayList<>();
                res.add(A.get(i).get(0));
                res.add(A.get(i).get(1));
                ans.add(res);

            }
            else if(B.get(1) < A.get(i).get(0))
            {
                ArrayList<Integer> res = new ArrayList<>();
                res.add(B.get(0));
                res.add(B.get(1));
                ans.add(res);
                for(int j = i; j<A.size(); j++)
                {
                    ArrayList<Integer> res1 = new ArrayList<>();
                    res1.add(A.get(j).get(0));
                    res1.add(A.get(j).get(1));
                    ans.add(res1);
                }
                System.out.println(ans);
                return;
                //insert all
            }
            else{

                B.add(0, getMin(B.get(0), A.get(i).get(0)));
                B.add(1, getMax(B.get(1), A.get(i).get(1)));

            }
        }
        ans.add(B);
        System.out.println(ans);
        
    }

    private static int getMin(int current, int previous)
    {
        if(current < previous)
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