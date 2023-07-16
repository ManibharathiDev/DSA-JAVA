package Arrays;
class RectangleLess{
    public static void main(String[] args)
    {
        int[] A = {1,2,3,4,5};
        int B = 5;
        int l = 0;
        int r = A.length-1;
        long count = 0;
        long mod = 1000000007;
        while(l<A.length && r >=0)
        {
            long area = (A[l]*A[r])%mod;
            if(area<B)
            {
                l++;
                count = (count+r+1)%mod;
            }
            else
            {
                r--;
            }
           
        }
        System.out.println(count);
    }
}