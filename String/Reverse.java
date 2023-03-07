package String;

public class Reverse {
    public static void main(String[] args)
    {
        String A = "Manibharathi";
        char[] As = A.toCharArray();
        int i = 0;
        int j = As.length-1;
        while(i<j)
        {
            char temp = As[i];
            As[i] = As[j];
            As[j] = temp;
            i++;
            j--;
        }
        System.out.println(String.valueOf(As));
    }
}
