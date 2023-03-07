package HashTest;
import java.util.HashMap;
import java.util.HashSet;

public class XOREqual{
    public static void main(String[] args){
        int[] A = {3, 6, 8, 10, 15, 50,6,3,6,10,15};
        int B = 5;
        int ans = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < A.length; i++)
        {
 
            // if (hs.contains(A[i] ^ B)) {
            //     ans++;
            // }
            // hs.add(A[i]);

            int res = A[i]^B;
            if(hm.containsKey(res))
            {
                if(hm.get(res) == 1)
                    ans += 1;
                hm.put(res, hm.get(res)+1);
            }
            else{
                if(hm.containsKey(A[i]))
                {
                    int value = hm.get(A[i]);
                    hm.put(A[i], value+1);
                }
                else{
                    hm.put(A[i],1);
                }
            }

        }
        System.out.println(ans);
    }
}