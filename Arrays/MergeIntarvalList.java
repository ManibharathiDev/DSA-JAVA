/**
 * ** Merge Overlapping Intervals
 * Problem Description
Given a collection of intervals, merge all overlapping intervals.



Problem Constraints
1 <= Total number of intervals <= 100000.



Input Format
First argument is a list of intervals.



Output Format
Return the sorted list of intervals after merging all the overlapping intervals.



Example Input
Input 1:

[1,3],[2,6],[8,10],[15,18]


Example Output
Output 1:

[1,6],[8,10],[15,18]


Example Explanation
Explanation 1:

Merge intervals [1,3] and [2,6] -> [1,6].
so, the required answer after merging is [1,6],[8,10],[15,18].
No more overlapping intervals present.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntarvalList{
    public static void main(String[] args)
    {
        ArrayList<Interval> A = new ArrayList<>();
        Interval nInterval = new Interval(3,3);
        A.add(nInterval);
        nInterval = new Interval(27,54);
        A.add(nInterval);
        nInterval = new Interval(33, 60);
        A.add(nInterval);
        nInterval = new Interval(79, 80);
        A.add(nInterval);
        nInterval = new Interval(22, 89);
        A.add(nInterval);
        nInterval = new Interval(21, 27);
        A.add(nInterval);
        nInterval = new Interval(39, 49);
        A.add(nInterval);
        nInterval = new Interval(41, 80);
        A.add(nInterval);
        nInterval = new Interval(83, 87);
        A.add(nInterval);
        nInterval = new Interval(4, 29);
        A.add(nInterval);

        nInterval = new Interval(44, 82);
        A.add(nInterval);

        nInterval = new Interval(72, 81);
        A.add(nInterval);
        nInterval = new Interval(20, 73);
        A.add(nInterval);

        ArrayList<Interval> ans = new ArrayList<>();

        if(A.size() == 1)
        {
            Interval interval = new Interval(A.get(0).start,A.get(0).end);
            ans.add(interval);
            //return ans;
        }

        Collections.sort(A, new Comparator <Interval>(){
            public int compare (Interval p1, Interval p2){
                if (p1.start != p2.start){
                    return p1.start - p2.start;
                }
                return p1.end - p2.end;
            }
        });

        int cStart = A.get(0).start;
        int cEnd = A.get(0).end;
        for(int i = 1; i<A.size(); i++)
        {
            int start = A.get(i).start;
            int end = A.get(i).end;

            if(cEnd < start)
            {
                Interval interval = new Interval(cStart,cEnd);
                ans.add(interval);
                cStart = start;
                cEnd = end;
                //oPosition++;
            }
            else
            {

                // if(ans.size() > 0)
                // {
                //     ans.remove(ans.size()-1);
                // }
                // Interval interval = new Interval();
                // interval.start =getMin(start, cStart);
                // interval.end = getMax(end, cEnd);
                // ans.add(interval);
                cStart = getMin(start, cStart);
                cEnd = getMax(end, cEnd);    
                
            }

        }

        Interval interval = new Interval();
                interval.start =cStart;
                interval.end = cEnd;
                ans.add(interval);

        

        for(int i = 0; i < ans.size(); i++)
        {
            System.out.println("Start=>"+ans.get(i).start);
            System.out.println("End==>"+ans.get(i).end);
        }

        // for(int i = A.size()-2; i>=0; i--)
        // {
        //     int start = A.get(i+1).start;
        //     int end = A.get(i+1).end;

        //     int cStart = A.get(i).start;
        //     int cEnd = A.get(i).end;

        //     if(cEnd < start)
        //     {
        //         Interval interval = new Interval(start,end);
        //         ans.add(interval);
        //     }
        //     else if()
        // }
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



class Interval{
    int start;
    int end;
    Interval(){

    }

    Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
}