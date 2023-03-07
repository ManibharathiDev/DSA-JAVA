import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class LargestValue {
    public static void main(String[] args)
    {
        ArrayList<Integer> largeList = new ArrayList<Integer>();
        largeList.add(97750768);
        largeList.add(60243460);
        largeList.add(63811365);
        largeList.add(485840);
        largeList.add(13023771);

        Collections.sort(largeList,new MyComparator());
        StringBuilder myString = new StringBuilder();
        int zero_elements = 0;
        for(int i = 0; i < largeList.size(); i++)
        {
            myString.append(largeList.get(i));
            if(largeList.get(i) == 0)
                zero_elements++;
        }
        if(zero_elements == largeList.size())
            System.out.println("0");
        System.out.println(myString);
    }

    static class MyComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            Long first = Long.parseLong(String.valueOf(o1)+String.valueOf(o2));
            Long second = Long.parseLong(String.valueOf(o2)+String.valueOf(o1));
            
            return (int)(second-first);
        }

    }

    
}
