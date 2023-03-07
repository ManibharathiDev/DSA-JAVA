import java.util.ArrayList;
import java.util.Collections;

public class RotateList {
    public static void main(String[] args){
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);

        ArrayList<Integer> bList = new ArrayList<>();
        bList.add(2);
        bList.add(3);

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();


        int k = bList.get(0)%aList.size();
        ArrayList<Integer> aCopy = (ArrayList<Integer>) aList.clone();
        getReverseElement(aCopy,0,aCopy.size()-1);
        getReverseElement(aCopy,0,k-1);
        System.out.println(getReverseElement(aCopy,k,aCopy.size()-1));
        //result.add(getReverseElement(aCopy,k,aCopy.size()-1));
        //System.out.println(aCopy);

        // for(int i = 0; i < bList.size(); i++)
        // {
        //     int k = bList.get(i)%aList.size();
        //     ArrayList<Integer> aCopy = (ArrayList<Integer>) aList.clone();
        //     getReverseElement(aCopy,0,aCopy.size()-1);
        //     getReverseElement(aCopy,0,k-1);
        //     result.add(getReverseElement(aCopy,k,aCopy.size()-1));
        //     System.out.println(aCopy);
        // }
    }

    public static ArrayList<Integer> getReverseElement(ArrayList<Integer> arr,int start,int end)
    {
        
        
        int i = start;
        int j = end;
        // ArrayList<Integer> newList = (ArrayList<Integer>) arr.clone();
        while(i<j)
        {
            Collections.swap(arr,i,j);
            i++;
            j--;
        }
        
        return arr;
    }
    
}
