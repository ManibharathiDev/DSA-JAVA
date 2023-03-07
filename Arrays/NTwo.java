package Arrays;
import java.util.HashMap;

public class NTwo{
    public static void main(String[] args)
    {
        int[] A = {2,1,2};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < A.length; i++)
        {
            if(hm.containsKey(A[i]))
            {
                hm.put(A[i],hm.get(A[i])+1);
            }
            else
                hm.put(A[i],1);
        }

        for(Integer key: hm.keySet()) 
        {
            if(hm.get(key) > Math.floor(A.length/2))
            {
                System.out.println(key);
            }
        }
    }
}
