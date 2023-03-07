import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.lang.model.util.ElementScanner6;

public class LargestNumber {
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(6);
        A.add(8);
        A.add(9);
        // A.add(2);
        // A.add(7);
        // A.add(7);
        // A.add(7);
        // A.add(7);
        // A.add(7);

        // A.add(7);
        // A.add(7);

        // A.add(7);
        // A.add(7);
        // A.add(7);

        // A.add(7);
        // A.add(7);
        // A.add(7);
        // A.add(7);
        // A.add(1);
        // A.add(75);
        // A.add(652);
        // A.add(87);
        // A.add(87);
        // A.add(107);
        // A.add(7);
        // A.add(7);
        // A.add(7);
        // A.add(7);
        // A.add(1);
        // A.add(75);
        // A.add(652);
        // A.add(87);
        // A.add(87);
        // A.add(107);
        // A.add(7);
        // A.add(7);
        // A.add(7);
        // A.add(7);
        // A.add(1);
        // A.add(75);
        // A.add(652);
        // A.add(87);
        // A.add(87);
        // A.add(107);
        // A.add(7);
        // A.add(7);
        // A.add(7);
        // A.add(7);
        // A.add(1);
        // A.add(75);
        // A.add(652);
        // A.add(87);
        // A.add(87);
        // A.add(107);
        // A.add(7);
        // A.add(7);

        System.out.println(A.size());
        
        
        Collections.sort(A, new FactorComparator());

        

        System.out.println(A);
    }

    static class AgeComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println(o1);
            System.out.println(o2);
           System.out.println(o1==o2);
           return 0;
        }
        
    }

    static class FactorComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            int first = countFactor(o1);
            int second = countFactor(o2);
            if(first<second)
                return -1;
            else if(second<first)
                return 1;
            else 
            {
                // if(o1<o2)
                //     return -1;
                // else
                //     return 1; 
                return o1-o2;   
            }     
            //return 0;   
            
        }
        
    }

    private static int countFactor(int num){
        int count = 0;
        for(int i = 1; i*i <=num ; i++)
        {
            if(num%i == 0)
                {
                    if(i == num/i)
                        count += 1;
                    else
                        count += 2;
                }
        }
        return count;
    }


}
