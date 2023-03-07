package HashTest;

public class SumDivisibileFive {
    public static void main(String[] args){

        int[] A = {0,2,3,4,6,2};
        System.out.println(solve(A));
    
    }

    public static int solve(int[] A){
        int ans  = 0;
        int sums = 0;
        int[] pf = new int[A.length];
        pf[0] = A[0];
        for(int i = 0; i < A.length; i++)
        {
            pf[i] = A[i] + pf[i-1];
        }

        for(int i = 0; i < A.length; i++)
        {
            if(i == 0)
            {
                if(pf[i]%5 == 0)
                    ans++;
            }

            if()
        }

        return ans;
    }


}
