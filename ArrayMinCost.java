import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayMinCost {

    public static void main(String[] args)
    {
    ArrayList<Integer> A = new ArrayList<Integer>();
    A.add(2);
    A.add(1);
    Collections.sort(A,Collections.reverseOrder());    

    int ans = 0;
    for(int i = 0; i<A.size(); i++)
    {
        ans += (i+1)*A.get(i);
    }
    System.out.println(ans);
    }
}
