package Arrays;
import java.util.Arrays;
import java.util.Stack; 
public class NearestSmalles
{
    public void main(String[] args)
    {
        int[] A = {4, 5, 2, 10, 8};
        int[] result = new int[A.length];
        Stack<Integer> stk = new Stack<Integer>();
        for(int i = 0; i < A.length; i++)
        {

            while(!stk.isEmpty() && stk.peek() >= A[i])
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

            stk.push(A[i]);
           
        }

        System.out.println(Arrays.toString(result));
    }
}