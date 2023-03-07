package String;

public class Prefix {
    public static void main(String[] args)
    {
        String[] A =  {"aaaaaaaaaaaaaaaaaaaaaaa", "aaaa", "aaaaaaaa","a"};

        // if(A.length == 1)
        //     return A[0];    

        String pre = A[0];
        for(int i = 1; i < A.length; i++)
        {
            String temp = "";
            int j = 0;
             while(j < pre.length() && j < A[i].length() && pre.charAt(j) == A[i].charAt(j))
             {
                temp += pre.charAt(j);
                j++;
             }
             pre = temp;
        }
        System.out.println(pre);
        
    }
}
