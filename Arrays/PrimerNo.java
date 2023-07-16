package Arrays;
import java.util.ArrayList;

public class PrimerNo {
    public static void main(String[] args) {
        int A = 10;
        ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        //Making all the values of 0 - A+1 index as true
        for(int i=1;i<=A+1;i++){
            res.add(1);
        }
        //Making first index as 0 since 1 is not a prime number
        res.set(1,0);

        System.out.println(res);
        //Start a loop from 2nd index and making all the multiple index as zero.
        //similarly continuing this for all the values until A.
        for(int i=2;i<=A;i++){
            if(res.get(i)==1){
                for(int j=2*i;j<res.size();j=j+i){
                    res.set(j,0);
                }
            }
        }
        System.out.println(res);
        //checking all the index with value 1. if found adding it to the ArrayList.
        for(int i=2;i<res.size();i++){
            if(res.get(i)==1){
                result.add(i);
            }
        }
        System.out.println(result);
        //return result;
    }
}
