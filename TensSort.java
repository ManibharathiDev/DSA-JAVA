import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TensSort {
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(15);
        A.add(11);
        A.add(7);
        A.add(9);
        // A.add(888);
        // A.add(417);
        // A.add(136);
        // A.add(979);
        Collections.sort(A,new DigitComparator());
        for(int i = 0; i < A.size(); i++)
        {
            System.out.println(A.get(i));
        }
    }

    static class DigitComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            int first = getDigit(o1);
            int second = getDigit(o2);

            if(first == second)
                return o2-o1;
            return first-second;
        }
        
    }

    public static int getDigit(int num)
    {
        return (num/10)%10;
    }
}
