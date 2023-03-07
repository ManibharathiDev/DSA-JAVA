package String;

public class CountOcc {
    public static void main(String[] args)
    {
        String A = "bobabtbobl";
        String S = "bob";
        char[] As = A.toCharArray();
        char[] Ss = S.toCharArray();
        int count = 0;
        for(int i = 0; i < As.length; i++)
        {
            int start = 0;
            if(As[i] == Ss[start])
            {
                for(int j = i; j < As.length; j++)
                {
                    
                    if(As[j] == Ss[start])
                    {
                        System.out.println(As[j]);
                        start++;
                    }
                    else
                        break;
                    if(start == Ss.length)
                        break;
                    
                }
            }

            if(start == Ss.length)
                count++;

            
        }
        System.out.println("Count of Occ=>"+count);

    }
}
