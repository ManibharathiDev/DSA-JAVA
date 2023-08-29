public class knapsack{
    public static int[][] dp;
    public static void main(String[] args) {
        int[] A = {359,963,465,706,146,282,828,962,492};
        int[] B = {96,43,28,37,92,5,3,54,93};
        int C = 383;

        System.out.println(solve(A,B,C));

    }

    
    public static int solve(int[] A, int[] B, int C) {
        int N = A.length;
        dp = new int[N][C + 1];
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < C+1; j++)
            {
                dp[i][j] = -1;
            }
        }
        int ans = maxHappy(N-1,C,A,B);
        return ans;
    }

    static int maxHappy(int i,int j,int[] A,int[] B)
    {
        if(i == 0 || j == 0)
        {
            return 0;
        }


        //System.out.println(dp[i][j]);

        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }

        if(B[i-1] <= j)
        {
            dp[i][j] = Math.max(
                (A[i-1]+maxHappy(i-1,j-B[i-1],A,B))
                ,maxHappy(i-1,j,A,B)
                );
        }
        else
        {
            dp[i][j] = maxHappy(i-1,j,A,B);
        }

       


        return dp[i][j];

    }
}