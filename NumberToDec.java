public class NumberToDec {
    public static void main(String[] args)
    {
        int A = 22;
        int B = 3;
        int sum = 0;
        int i = 0;
        while(A > 0)
        {
            int remainder = A%10;
            sum += remainder*(Math.pow(B,i));
            A = A/10;
            i++;
        }
        //System.out.println(sum);

        int num = 4;
        int base = 3;
        sum = 0;
        i = 0;
        //A%B * Math.pow(10,power);
        while(num>0)
        {
            int remainder = num%base;
            sum += remainder*Math.pow(10, i);
            num = num/base;
            i++;

        }
        System.out.println(sum);

    }
}
