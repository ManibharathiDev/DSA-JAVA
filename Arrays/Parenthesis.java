package Arrays;
import java.util.Stack; 
public class Parenthesis {
    public static void main(String[] args)
    {
          
        String A = "}{([])}";
        System.out.println(solve(A));
          
    }

    public static int solve(String A)
    {
        if(A.length() == 0)
            return 1;

        Stack<String> stk = new Stack<String>();
        for(int i = 0; i < A.length(); i++)
        {
            if(String.valueOf(A.charAt(i)).equals("{") || String.valueOf(A.charAt(i)).equals("[") 
            || String.valueOf(A.charAt(i)).equals("("))
            {
                stk.push(String.valueOf(A.charAt(i)));
            }
            else
            {
                if(String.valueOf(A.charAt(i)).equals("}"))
                {
                    if(i == 0)
                        return 0;
                    if(stk.peek().equals("{"))
                    {
                        stk.pop();
                        continue;
                    }
                    return 0;
                }
                else if(String.valueOf(A.charAt(i)).equals(")"))
                {
                    if(i == 0)
                        return 0;
                    if(stk.peek().equals("("))
                    {
                        stk.pop();
                        continue;
                    }
                    return 0;
                }
                else{
                    if(i == 0)
                        return 0;
                    
                    if(stk.peek().equals("["))
                    {
                        stk.pop();
                        continue;
                    }
                    return 0;
                }
            }
        }
        if(stk.isEmpty())
            return 1;
        return 0;    

    }
}
