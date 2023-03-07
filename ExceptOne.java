public class ExceptOne {
    public static void main(String[] args){
        int[] A = {1, 2, 2, 3, 1};
        int ans = 0;
        for(int i = 0; i < A.length; i++)
        {
            ans ^= A[i];
        }
        System.out.println(ans);
    }
}
