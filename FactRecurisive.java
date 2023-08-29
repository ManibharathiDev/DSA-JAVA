public class FactRecurisive {
    public static void main(String[] args)
    {
        int A = 5;
        int ans = 1;
        for(int i = 1; i <=A; i++)
        {
            ans *=i;
        }
        System.out.println(ans);
        System.out.println(fact(5));
    }

    public static int fact(int A)
    {
        if(A == 1)
            return 1;
        return A*fact(A-1);    

    }

}
