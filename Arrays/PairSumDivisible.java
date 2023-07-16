package Arrays;

import java.util.HashMap;

class PairSumDivisible{

        public static void main(String[] args)
        {
            int[] A = {93, 9, 46, 79, 56, 24, 10, 26, 9, 93, 31, 93, 75, 7, 4, 80, 19, 67, 49, 84, 62, 100, 17, 40, 35, 84, 14, 81, 99, 31, 100, 66, 70, 2, 11, 84, 60, 89, 13, 57, 47, 60, 59, 60, 42, 67, 89, 29, 85, 83, 42, 47, 66, 80, 88, 85, 83, 82, 16, 23, 21, 55, 26, 2, 21, 92, 85, 26, 46, 3, 7, 95, 50, 22, 84, 52, 57, 44, 4, 23, 25, 55, 41, 49};
            int B = 37;
            System.out.println(solve(A, B));
        }
        //ans += ((long)hm. get(i) * hm. get(B-i));
        public static int solve(int[] A, int B) {
            //HashMap
            int mods = 1000000007;
            HashMap<Integer,Integer> hm = new HashMap<>();
            for(int i = 0; i < A.length; i++)
            {
                int mod = A[i]%B;
                if(hm.containsKey(mod))
                {
                    hm.put(mod, hm.get(mod)+1);
                }
                else
                {
                    hm.put(mod, 1);
                }
            }
            System.out.println(hm);
            long ans = 0;
            if(hm.containsKey(0))
            {
                int f = hm.get(0);
                ans += (f*(f-1))/2;
            }
    
            if(B%2 == 0)
            {

              
                if(hm.containsKey(B/2))
                {
                    int f = hm.get(B/2);
                    ans += (f*(f-1))/2;
                }
            }
    
            for(int i = 1; i<= ((B-1)/2); i++)
            {

                if(hm.containsKey(i) && hm.containsKey(B-i))
                    ans += (hm.get(i) * hm.get(B-i));
            }
    
            return (int)(ans%mods);
        //     int N = A.length;
    
        //     //Step 1 Create the count array and store the frequency of A[i]%m in count array
    
        //     long[] count = new long[B];
    
        //     for(int i =0;i<N;i++){
        //         int rem = A[i] % B;
        //         count[rem]++;
        //     }
    
        //     //Step 2 find the number of pairs and handle edge cases
        //     //Edge Case for rem =0
    
        //     long ans =0;
        //     long x = count[0];
        //     ans += (x *(x-1))/2;
    
        //     //Edge case for rem = B/2 only valid if B is even in odd case not valid
    
        //     if(B % 2 == 0){
        //       long y = count[B/2];
        //       ans += (y * (y-1))/2;
        //     }
    
        //     //normal cases
        //     int i=1;
        //     int j = B-1;
    
        //     while(i<j){
        //         ans += count[i]*count[j];
        //         i++;
        //         j--;
        //     }
        // return (int)(ans % 1000000007);
        }
    
    
}