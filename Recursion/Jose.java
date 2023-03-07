package Recursion;

import java.util.ArrayList;

public class Jose {
    public static void main(String[] args)
    {
        int A = 4;
        int B = 3;
        ArrayList<Integer> data = new ArrayList<>();
        for(int i = 0; i < A; i++)
        {
            data.add(i+1);
        }
        System.out.println(data);
        //System.out.println(getSolution(data, B,0));
        System.out.println(getJosh(A, B));
    }

    private static int getJosh(int A, int i)
    {
        if(A == 1)
            return 1;
        return getJosh(A-1,(i+A-1)%A);    
    }

    private static int getSolution(ArrayList<Integer> data,int B,int i)
    {
            if(data.size() == 1)
                return data.get(0);
            int newi=(i+B-1)%data.size();
            data.remove((i+B-1)%data.size());  
            i = newi;
            return getSolution(data, B, i);
    }
}
