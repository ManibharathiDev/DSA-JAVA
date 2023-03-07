package SubSequence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SubSet {
    public static void main(String[] args)
    {


        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        A.add(2);
        A.add(1);
        A.add(3); 
        A.add(3);    
       
        int length = A.size(); 
        for(int i = 0; i<Math.pow(2, length); i++ )
        {
            ArrayList<Integer> result = new ArrayList<>();
            HashSet<Integer> rSet = new HashSet<>();
            for(int j = 0; j < A.size(); j++)
            {
                if(isOn(i, j) == 1)
                {
                    //result.add(A.get(j));
                    rSet.add(A.get(j));
                }
            }
            result.addAll(rSet);
            Collections.sort(result);
            set.add(result);
            System.out.println("");
        }
        res.addAll(set);

        Collections.sort(res, (ArrayList < Integer > first, ArrayList < Integer > second) -> {
            for (int i = 0; i < first.size() && i < second.size(); i++) 
            {
                if (first.get(i) < second.get(i))
                    return -1;
                if (first.get(i) > second.get(i))
                    return 1;
            }
            if (first.size() > second.size())
                return 1;
            return -1;
        });

        

        System.out.println(res);

        // int[] A = {1,2,3};
        // int[][] res = new int[(int) Math.pow(2, A.length)][(int) Math.pow(2, A.length)];
        // int length = A.length;
        // for(int i = 0; i<Math.pow(2, length); i++ )
        // {
        //     for(int j = 0; j < A.length; j++)
        //     {
        //         if(isOn(i, j) == 1)
        //         {
        //             System.out.print(A[j]);
        //         }
        //     }
        //     System.out.println("");
        // }
        
    }

    private static int isOn(int i, int j)
    {
        return (i>>j & 1);
    }
}
