package String;

public class AddBinary {
    public static void main(String[] args)
    {
        String A = "111";
        String B = "1";
        System.out.println(addBinary(A,B));
    }

    
    public static String addBinary(String A, String B) {
        int Alen = A.length()-1;
        int Blen = B.length()-1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(Alen >=0 || Blen >=0 || carry > 0)
        {
            int sum = 0;
            if(Alen >=0)
            {
                sum += A.charAt(Alen) - '0';
                Alen--;
            }
            if(Blen >=0)
            {
                sum += B.charAt(Blen) - '0';
                Blen--;
            }
            sum += carry;
            int cur = sum % 2;
            carry = sum/2;
            sb.append(cur);
        }
        return sb.reverse().toString();
    }
}
