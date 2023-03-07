import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListComparator {
    public static void main(String[] args)
    {
        ArrayList<Integer> A = new ArrayList<Integer>();
        A.add(3);
        A.add(30);
        A.add(34);
        A.add(5);
        A.add(9);

        Collections.sort(A);
        Object[] objects = A.toArray();
        System.out.println(Arrays.toString(objects));
    }
  
}
