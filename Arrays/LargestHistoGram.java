package Arrays;
import java.util.Arrays;
import java.util.Stack; 
public class LargestHistoGram 
{
    public static void main(String[] args)
    {
        int[] A= {90,58,69,70,82,100,13,57,47,18};
        System.out.println(largestRectangleArea(A));
    }

public static int largestRectangleArea(int[] A) {
        if(A.length == 1)
            return A[0];
    
        int[] nsl = nsl(A);
        int[] nsr = nsr(A);
        int ans = 0;
        for(int i = 0; i < A.length; i++)
        {
            int width = nsr[i]-nsl[i]-1;
            int cur_area = A[i]*width;
            ans = getMax(ans,cur_area);
        }
        return ans;
    }

    public static int getMax(int current,int previous)
    {
        if(current > previous)
            return current;
        return previous;
    }

    public static int[] nsl(int[] A)
    {
        int[] result = new int[A.length];
        Stack<Integer> stk = new Stack<Integer>();
        for(int i = 0; i < A.length; i++)
        {

            while(!stk.isEmpty() && A[stk.peek()] >= A[i])
            {
                stk.pop();
            }

            if(stk.isEmpty())
            {
                result[i] = -1;
            }
            else
            {
                result[i] = stk.peek();
            }

            stk.push(i);
           
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static int[] nsr(int[] A)
    {
        int[] result = new int[A.length];
        Stack<Integer> stk = new Stack<Integer>();
        for(int i = A.length-1; i >= 0; i--)
        {

            while(!stk.isEmpty() && A[stk.peek()] >= A[i])
            {
                stk.pop();
            }

            if(stk.isEmpty())
            {
                result[i] = A.length;
            }
            else
            {
                result[i] = stk.peek();
            }

            stk.push(i);
           
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
