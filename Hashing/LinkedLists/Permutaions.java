public class Permutaions{
    public static void main(String[] args)
    {

    }

    public static int solve(String A, String B) {
        int[] FA = new int[26];
        int[] FB = new int[26];
        for(int i = 0; i < FA.length; i++)
        {
            FA[i] = 0;
            FB[i] = 0;
        }

        int N = A.length();
        int M = B.length();
        int count = 0;

        for(int i = 0; i < N; i++)
        {
            FA[A.charAt(i)-'a']++;
        }

        for(int i = 0; i < N; i++)
        {
            FB[B.charAt(i)-'a']++;
        }

        if(check(FA,FB) == 1)
            count++;

        for(int i = N; i<M; i++)
        {
            FB[B.charAt(i)-'a']++;
            FB[B.charAt(i-N)-'a']--;
            if(check(FA,FB) == 1)
                count++;
        }    
        return count;

    }

    public static int check(int[] FA,int[] FB)
    {
        
        for(int i = 0; i < 26; i++)
        {
            if(FA[i] != FB[i])
            {
                return 0;
            }
        }
        return 1;
    }
}