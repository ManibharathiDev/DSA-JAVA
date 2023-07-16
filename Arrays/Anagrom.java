package Arrays;
import java.util.Stack; 
public class Anagrom {
    public static void main(String[] args)
    {
        String A = "ab";
        System.out.println(solve(A));
    }

    public static String solve(String A)
    {
        if(A.length() == 0)
            return A;

        Stack<String> stk = new Stack<String>();
        for(int i = 0; i < A.length(); i++)
        {
            if(!stk.isEmpty())
            {
                if(stk.peek().equals(String.valueOf(A.charAt(i))))
                {
                    stk.pop();
                }
                else
                    stk.push(String.valueOf(A.charAt(i)));
            }
            else
            {
                stk.push(String.valueOf(A.charAt(i)));
            }
        }

        String result = "";

        while(!stk.isEmpty())
        {
            result += stk.peek();
            stk.pop();
        }

        char ch;
        String nString = "";
        for (int i=0; i<result.length(); i++)
        {
            ch= result.charAt(i); 
            nString= ch+nString; 
       }

        return nString;
    }
}
