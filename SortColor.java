import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortColor {
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(0);
    
        Collections.sort(A,new SortComparator());

        for(int i = 0; i < A.size(); i++)
        {
            System.out.println(A.get(i));
        }

    }

    static class SortComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            if(o1<o2)
                return -1;
            else
                return 1;
        }
        
    }
}
