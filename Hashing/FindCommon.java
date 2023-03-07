package Hashing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindCommon{
    public static void main(String[] args)
    {
        int[] A = {19, 19, 3, 5, 6};
        int[] B = {2, 8, 2, 12, 16, 3};
        int count =0;
        HashMap<Integer,Integer> AsHm = new HashMap<>();
        HashMap<Integer,Integer> BsHm = new HashMap<>();

        for(int i = 0; i < A.length; i++)
        {
            if(AsHm.containsKey(A[i]))
            {
                int value = AsHm.get(A[i]);
                AsHm.put(A[i], value+1);
            }
            else{
                AsHm.put(A[i], 1);
            }
        }

        for(int i = 0; i < B.length; i++)
        {
            if(BsHm.containsKey(B[i]))
            {
                int value = BsHm.get(B[i]);
                BsHm.put(B[i], value+1);
            }
            else{
                BsHm.put(B[i], 1);
            }
        }


        for(Map.Entry<Integer, Integer> mapElement :AsHm.entrySet()){

            if(BsHm.containsKey(mapElement.getKey()))  {

            count = count + (mapElement.getValue() >BsHm.get(mapElement.getKey())?BsHm.get(mapElement.getKey()):mapElement.getValue());

            }
        }

        int returnArray[] = new int[count];
        int position =0;
        for(Map.Entry<Integer, Integer> mapElement :AsHm.entrySet())
        {

            if(BsHm.containsKey(mapElement.getKey()))  {

            int temp =0;
             temp =  (mapElement.getValue() >BsHm.get(mapElement.getKey())?BsHm.get(mapElement.getKey()):mapElement.getValue());

            while(temp>0){
                returnArray[position] = mapElement.getKey();
                position++;
                temp--;
            }
            }
        }

        System.out.println(Arrays.toString(returnArray));

        
    }

    public static int getMax(int current, int previous)
    {
        if(current > previous)
        {
            return current;
        }
        return previous;
    }
}