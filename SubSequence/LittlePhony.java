package SubSequence;

public class LittlePhony{
    public static void main(String[] args)
    {

        String A = "abcdsfhjagj";
        //String ans = "";


        char min1 = Character.MAX_VALUE;
        char min2 = Character.MAX_VALUE;  
        int indx = -1;
        //Find First Min
        for(int i = 0; i < A.length()-1; i++)
        {
            char ch = A.charAt(i);
            if(ch<min1)
            {
                indx = i;
                min1 = ch;
            }
        }  

        for(int i = indx+1; i < A.length(); i++)
        {
            char ch = A.charAt(i);
            if(ch<min2)
            {
                indx = i;
                min2 = ch;
            }
        }
        String ans = min1+""+min2;
        System.out.println(ans);

        // for(int i = 0; i < A.length()-1; i++)
        // {
        //     ans = A;
        //     int MIN = Integer.MAX_VALUE;
        //     for(int j = i+1; j<A.length(); j++)
        //     {
        //         int Current = A.charAt(j)-'0';
        //         MIN = getMin(Current, MIN);
        //     }
        // }

        

        // String A = "abcd";
        // //int[] A = {1,2,3,4,5,6};
        // int n = A.length();
        // int[] lex = new int[26];

        // for(int i = 0; i < lex.length; i++)
        // {
        //     lex[i] = 0;
        // }

        // for(int i = 0; i < A.length(); i++)
        // {
        //     int idx = A.charAt(i)-97;
        //     lex[idx]++;
        // }
        
        
        
        // for(int i = 0; i < Math.pow(2, n); i++)
        // {
        //     int count = 0;
        //     int sum = 0;
        //     String s= "";
        //     for(int j = 0;  j < n; j++)
        //     {
        //         if(isOn(i, j) == 1)
        //         {
        //             count++;
        //             int idx = A.charAt(j)-97;
        //             sum += idx;
        //             s += A.charAt(j);
        //             //System.out.print(A.charAt(j));
        //             if(count == 2)
        //             {   
        //                 System.out.print(s);
        //                 break;
        //             }
        //             //System.out.print(A.charAt(j));
        //         }
                
        //     }
        //     System.out.println("");
        // }
        
    }

    private static int getMin(int Current, int previous)
    {
        if(Current<previous)
            return Current;
        return previous;
    }

    

    private static int isOn(int i, int j)
    {
        return (i>>j & 1);
    }
}