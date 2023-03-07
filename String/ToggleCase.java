package String;

public class ToggleCase {
    public static void main(String[] args){
        String A = "AnAconDa";
            char[] As = A.toCharArray();
            
            for(int i = 0; i < As.length; i++)
            {
                As[i] = (char) ((As[i]^(1<<5)));
            }
            System.out.println(String.valueOf(As));
    }
}
