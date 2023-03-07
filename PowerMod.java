public class PowerMod{
    public static void main(String[] arg){
        int a = 55711;
        int n = 284;
        int mod = 64649;
        
        System.out.println(power(a, n, mod));
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