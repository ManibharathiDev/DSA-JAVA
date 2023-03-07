public class ArrayPower
{
    public static void main(String[] args)
    {
        // int[] A = {4, 3, 5, 3, 5, 3, 2, 1};
        // int p = 47;
        // int ans = 0;
        // for(int i = 0; i < A.length; i++)
        // {
        //     ans = (ans+(A[i]%p * power(10, A.length-i-1, p)))%p;
        // }
        // System.out.println(ans);

        int[] A = {4, 3, 5, 3, 5, 3, 2, 1};
        int B = 47;
        long ans = 0;
        long r = 1;
        for(int i = A.length-1; i >=0; i--)
        {
            ans = (ans+(A[i]%B * r % B)%B)%B;
            r = (r*10)%B;
        }

        System.out.println((int)ans);

    }

    private static int power(int a, int n , int mod){
        long ans = 1;
        for(int i = 0; i < n; i++)
        {
            //ans = (ans*a)%mod;
            ans = ((ans%mod)*(a%mod))%mod;
        }
        return (int) ans;
    }
    
}

