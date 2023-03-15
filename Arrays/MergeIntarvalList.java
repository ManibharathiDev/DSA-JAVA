import java.util.ArrayList;

public class MergeIntarvalList{
    public static void main(String[] args)
    {
        ArrayList<Interval> A = new ArrayList<>();
        Interval nInterval = new Interval(1,3);
        A.add(nInterval);
        nInterval = new Interval(2,5);
        A.add(nInterval);
        nInterval = new Interval(4,7);
        A.add(nInterval);
        nInterval = new Interval(8,10);
        A.add(nInterval);

        ArrayList<Interval> ans = new ArrayList<>();

        int cStart = A.get(0).start;
        int cEnd = A.get(0).end;
        int oPosition = -1;
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
                oPosition++;
            }
            else
            {

                if(oPosition != -1)
                {
                    ans.remove(oPosition);
                }
                Interval interval = new Interval();
                interval.start =getMin(start, cStart);
                interval.end = getMax(end, end);
                ans.add(interval);
                cStart = interval.start;
                cEnd = interval.end;    
            }

        }

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