package String;

import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args)
    {
        String text = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
        text = text.trim();
        String[] texts = text.split(" ");
        System.out.println(Arrays.toString(texts));
        text = "";
        for(int i = texts.length-1; i>=0; i--)
        {
            
                text +=texts[i]+" ";
        }
        System.out.println(text.trim());
        // text = reverse(text);
        // String res = ""
        
        // for(int i = 0; i <text.length(); i++)
        // {
        //     if(text.charAt(i) == 32)
        //     {
        //         res += reverse()
        //     }
                
        // }
    }

    // public static String reverse(String A)
    // {
    //     char[] As =A.toCharArray();
    //     int i = 0;
    //     int j = As.length-1;
    //     while(i<j)
    //     {
    //         char temp = As[i];
    //         As[i] = As[j];
    //         As[j] = temp;
    //         i++;
    //         j--;
    //     }
    //     return String.valueOf(As);
    // }
}
